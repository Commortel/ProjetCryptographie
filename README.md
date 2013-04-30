#ProjetCryptographie
===================

#Subject : Un Annuaire Electronique Sécurisée

1. Objectif.
Concevoir et développer une application Java implémentant un carnet
d'adresse électronique permettant à son utilisateur de stocker et consulter
des informations sous la forme de couples (nom, information). L'accès au
contenu du carnet devra être protégé par un mot de passe et l'utilisateur
devra avoir la possibilité de stocker les informations sous forme chiffrée.
2. Structure de l'application.
	* 2.1 Présentation externe.
	
	Votre application devra présenter une interface graphique comportant des
	champs textes permettant la saisie :

		1. du mot de passe du propriétaire du carnet
		2. du nom servant de clé de recherche pour une insertion ou une consul-
		tation
		3. de l'adresse associée à un nom
		Elle pourra aussi présenter sous forme de menu ou de boutons des options
		activant ou inhibant le chiffrage
	* 2.2 Conseils.
Pour les composants graphiques préférer les composants swing. Pour le
stockage des données en mémoire interne utiliser une des classes de l'archi-
tecture des collections Java implémentant l'interface Map.

#MailTo : BOUABID M'HAMED

Utiliser le client mail par défaut pour précharger l'envoie d'un mail avec l'adresse sélectionnée.
<code>
	uriMailTo = new URI("mailto", mailTo, null);
    	Desktop.getDesktop().mail(uriMailTo);
</code>	

#Import Google csv file : DAVER LEONARD

Permettre l'insertion dans la table d'une liste d'utilisateur sous le format google cvs file export. Extraire juste le nom et le mail principal du fichier.

<code>
	String[] tmp = csv.split(",");
	data.put(tmp[i].trim(), tmp[i+28].trim());
</code>

#Tools : MEYER THIBAUT

CryptoTools, StringTools, FileTools & NoteBookFile permette de simplifier le code dans action courante. ( Voir Javadoc pour plus de détails )

Crypto -> Fonction de cryptage/décryptage 3DES,  SHA-1, MD5.
String -> Opération basique sur les String vers différents format, byte[], HashMap<Sting,String>.
File -> Sauvegarde, Lecture et Ecriture des fichiers.
NoteBookFile -> Format sortant récupérant les données contenues dans la table ainsi que le format de cryptage et le password en SHA-1.

#Core : MEYER THIBAUT

MainWindows est la vue principale gérant les événements courants du menu ainsi que du JPanel, NoteBook qui gère les données.

#Utilisation

Lancement du programme :
* Ajouter des lignes via le menu ou le bouton.
* Importer des contacts.
* Ouvrir un fichier déjà existant. 

Utilisation courante :
* Supprimer une ligne via le menu ou le bouton
* Envoie un mail au contact 

Fermeture du programme:
* Proposition de sauvegarde si la table à changé ( import, add ou remove)
* Sauvegarde avec un login ( nom du fichier + .cry) et un password. La combinaison des deux sert à générer la clé de cryptage.

# Difficultés rencontrées

Action : Cryptage/Decryptage
Problème : java-security-illegal-key-size-or-default-parameters
Solution : http://www.oracle.com/technetwork/java/javase/downloads/jce-7-download-432124.html ( Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files 7 Download )

Action : Afficher les données
Problème : JTable inefficace
Solution : Adaptation de la TableView de Stéphane Brunner ( http://java.developpez.com/telecharger/detail/id/864/JTableView ), bien que quelques fonctions soient dépréciés.
