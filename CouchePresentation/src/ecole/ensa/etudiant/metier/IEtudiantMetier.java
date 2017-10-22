package ecole.ensa.etudiant.metier;

import ecole.ensa.etudiant.model.Etudiant;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEtudiantMetier extends Remote {
	Etudiant searchEtudiantByCin(String cin) throws RemoteException;
	// change for githuuub
}
