-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  sam. 06 juin 2020 à 15:11
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `timetable`
--
CREATE DATABASE IF NOT EXISTS `timetable` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `timetable`;

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

DROP TABLE IF EXISTS `cours`;
CREATE TABLE IF NOT EXISTS `cours` (
  `ID_cours` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_cours`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `cours`
--

INSERT INTO `cours` (`ID_cours`, `nom`) VALUES
(1, 'POO Java'),
(2, 'Web dynamique'),
(3, 'Physique'),
(4, 'English');

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

DROP TABLE IF EXISTS `enseignant`;
CREATE TABLE IF NOT EXISTS `enseignant` (
  `ID_utilisateur` int(11) NOT NULL,
  `ID_cours` int(11) NOT NULL,
  PRIMARY KEY (`ID_utilisateur`,`ID_cours`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `enseignant`
--

INSERT INTO `enseignant` (`ID_utilisateur`, `ID_cours`) VALUES
(3, 1),
(3, 2),
(4, 4),
(5, 2),
(6, 3),
(21, 2);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `etudiant`;
CREATE TABLE IF NOT EXISTS `etudiant` (
  `ID_utilisateur` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `ID_groupe` int(11) NOT NULL,
  PRIMARY KEY (`ID_utilisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `etudiant`
--

INSERT INTO `etudiant` (`ID_utilisateur`, `numero`, `ID_groupe`) VALUES
(7, 1, 1),
(8, 2, 1),
(9, 3, 1),
(10, 4, 2),
(11, 5, 2),
(12, 6, 2),
(13, 7, 2),
(14, 8, 3),
(15, 9, 3),
(16, 10, 3),
(17, 11, 4),
(18, 12, 5),
(19, 13, 6),
(20, 14, 6);

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

DROP TABLE IF EXISTS `groupe`;
CREATE TABLE IF NOT EXISTS `groupe` (
  `ID_groupe` int(11) NOT NULL AUTO_INCREMENT,
  `Nom` varchar(255) NOT NULL,
  `ID_promotion` int(11) NOT NULL,
  PRIMARY KEY (`ID_groupe`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `groupe`
--

INSERT INTO `groupe` (`ID_groupe`, `Nom`, `ID_promotion`) VALUES
(1, 'Gr01', 1),
(2, 'Gr02', 1),
(3, 'Gr01', 2),
(4, 'Gr02', 2),
(5, 'Gr02', 3),
(6, 'Gr10', 3);

-- --------------------------------------------------------

--
-- Structure de la table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
CREATE TABLE IF NOT EXISTS `promotion` (
  `ID_promotion` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_promotion`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `promotion`
--

INSERT INTO `promotion` (`ID_promotion`, `nom`) VALUES
(1, 'Ing1'),
(2, 'Ing2'),
(3, 'Ing3');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `salle`;
CREATE TABLE IF NOT EXISTS `salle` (
  `ID_salle` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  `capacite` int(11) NOT NULL,
  `ID_site` int(11) NOT NULL,
  PRIMARY KEY (`ID_salle`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`ID_salle`, `nom`, `capacite`, `ID_site`) VALUES
(1, 'P445', 93, 2),
(2, 'P437', 42, 2),
(3, 'Amphi 1', 421, 3),
(4, 'Amphi 2', 285, 3),
(5, 'EM009', 187, 1),
(6, 'EM118', 79, 1);

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

DROP TABLE IF EXISTS `seance`;
CREATE TABLE IF NOT EXISTS `seance` (
  `ID_seance` int(11) NOT NULL AUTO_INCREMENT,
  `semaine` int(11) NOT NULL,
  `date` date NOT NULL,
  `heure_debut` time NOT NULL,
  `heure_fin` time NOT NULL,
  `etat` int(11) NOT NULL,
  `ID_cours` int(11) NOT NULL,
  `ID_type_cours` int(11) NOT NULL,
  PRIMARY KEY (`ID_seance`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `seance`
--

INSERT INTO `seance` (`ID_seance`, `semaine`, `date`, `heure_debut`, `heure_fin`, `etat`, `ID_cours`, `ID_type_cours`) VALUES
(1, 2, '2020-01-06', '08:30:00', '10:00:00', 2, 1, 2),
(2, 2, '2020-01-06', '10:15:00', '11:45:00', 2, 3, 1),
(3, 2, '2020-01-06', '12:00:00', '13:30:00', 2, 3, 2),
(4, 2, '2020-01-06', '13:45:00', '15:15:00', 1, 3, 1),
(5, 2, '2020-01-07', '08:30:00', '10:00:00', 2, 4, 2),
(6, 2, '2020-01-07', '08:30:00', '10:00:00', 2, 4, 2);

-- --------------------------------------------------------

--
-- Structure de la table `seance_enseignant`
--

DROP TABLE IF EXISTS `seance_enseignant`;
CREATE TABLE IF NOT EXISTS `seance_enseignant` (
  `ID_seance` int(11) NOT NULL,
  `ID_utilisateur` int(11) NOT NULL,
  PRIMARY KEY (`ID_seance`,`ID_utilisateur`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `seance_enseignant`
--

INSERT INTO `seance_enseignant` (`ID_seance`, `ID_utilisateur`) VALUES
(1, 3),
(2, 6),
(3, 6),
(4, 6),
(5, 4),
(6, 4);

-- --------------------------------------------------------

--
-- Structure de la table `seance_groupes`
--

DROP TABLE IF EXISTS `seance_groupes`;
CREATE TABLE IF NOT EXISTS `seance_groupes` (
  `ID_seance` int(11) NOT NULL,
  `ID_groupe` int(11) NOT NULL,
  PRIMARY KEY (`ID_seance`,`ID_groupe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `seance_groupes`
--

INSERT INTO `seance_groupes` (`ID_seance`, `ID_groupe`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1);

-- --------------------------------------------------------

--
-- Structure de la table `seance_salles`
--

DROP TABLE IF EXISTS `seance_salles`;
CREATE TABLE IF NOT EXISTS `seance_salles` (
  `ID_seance` int(11) NOT NULL,
  `ID_salle` int(11) NOT NULL,
  PRIMARY KEY (`ID_seance`,`ID_salle`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `seance_salles`
--

INSERT INTO `seance_salles` (`ID_seance`, `ID_salle`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6);

-- --------------------------------------------------------

--
-- Structure de la table `site`
--

DROP TABLE IF EXISTS `site`;
CREATE TABLE IF NOT EXISTS `site` (
  `ID_site` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_site`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `site`
--

INSERT INTO `site` (`ID_site`, `nom`) VALUES
(1, 'Eiffel 1'),
(2, 'Eiffel 2'),
(3, 'CNAM');

-- --------------------------------------------------------

--
-- Structure de la table `type_cours`
--

DROP TABLE IF EXISTS `type_cours`;
CREATE TABLE IF NOT EXISTS `type_cours` (
  `ID_type_cours` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(255) NOT NULL,
  PRIMARY KEY (`ID_type_cours`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `type_cours`
--

INSERT INTO `type_cours` (`ID_type_cours`, `nom`) VALUES
(1, 'cours interactif'),
(2, 'cours magistral'),
(3, 'TD'),
(4, 'TP'),
(5, 'soutien'),
(6, 'projet');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `ID_utilisateur` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `droit` int(11) NOT NULL,
  PRIMARY KEY (`ID_utilisateur`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`ID_utilisateur`, `email`, `password`, `nom`, `prenom`, `droit`) VALUES
(1, 'alex.lacase@edu.ece.fr', 'rorodu92', 'Alexandre', 'Lacase', 1),
(2, 'juliette.dupont@edu.ece.fr', 'lalala', 'Dupont', 'Juliette', 2),
(3, 'jack.rolando@ece.fr', 'omomo', 'Rolando', 'Jack', 3),
(4, 'herve.morel@ece.fr', 'ololo', 'Morel', 'Herve', 3),
(5, 'julien.dubois@ece.fr', 'lololo', 'Dubois', 'Julien', 3),
(6, 'hugo.bedimo@ece.fr', 'lensol', 'Bedimo', 'Hugo', 3),
(7, 'raphael.gillet@edu.ece.fr', 'snelsnel', 'Gillet', 'Raphael', 4),
(8, 'guillaume.cahuzac@edu.ece.fr', 'pabqjs', 'Cahuzac', 'Guillaume', 4),
(9, 'florian.sotoca@edu.ece.fr', 'mqpadbf', 'Sotoca', 'Florian', 4),
(10, 'yannick.gomis@edu.ece.fr', 'dubuta', 'Gommis', 'Yannick', 4),
(11, 'nabil.aouar@edu.ece.fr', 'pasoufouf', 'Aouar', 'Nabil', 4),
(12, 'jean.tolisso@edu.ece.fr', 'olbayern', 'Tolisso', 'Jean', 4),
(13, 'steven.fortes@edu.ece.fr', 'hruthurt', 'Fortes', 'Steven', 4),
(14, 'clement.michelin@edu.ece.fr', 'lateral', 'Michelin', 'Clement', 4),
(15, 'pauline.fekir@edu.ece.fr', 'hudrat', 'Fekir', 'Pauline', 4),
(16, 'marlene.sasoeur@edu.ece.fr', 'pasdidee', 'Sasoeur', 'Marlene', 4),
(17, 'thierry.ambrose@edu.ece.fr', 'centreavant', 'Ambrose', 'Thierry', 4),
(18, 'matheo.cambier@edu.ece.fr', 'quiery', 'Cambier', 'Matheo', 4),
(19, 'romain.perennou@edu.ece.fr', 'roca92', 'Perennou', 'Romain', 4),
(20, 'clement.mace@edu.ece.fr', 'clemswars', 'Mace', 'Clement', 4),
(21, 'jean.odages@ece.fr', 'franceioi', 'Odages', 'Jean', 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
