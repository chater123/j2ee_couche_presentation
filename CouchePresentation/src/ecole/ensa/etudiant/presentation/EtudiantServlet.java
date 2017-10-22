package ecole.ensa.etudiant.presentation;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ecole.ensa.etudiant.metier.IEtudiantMetier;
import ecole.ensa.etudiant.model.Etudiant;

@WebServlet("/EtudiantServlet")
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public EtudiantServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			IEtudiantMetier metier = (IEtudiantMetier) Naming.lookup("rmi://localhost/test");
			String cin = request.getParameter("cinForm");
			Etudiant model = metier.searchEtudiantByCin(cin);
			request.setAttribute("MonEtudiant", model);
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("/vues/etudiantVue.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
