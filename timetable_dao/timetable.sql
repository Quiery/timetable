-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 01, 2020 at 08:40 PM
-- Server version: 5.7.25
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `timetable`
--

--
-- Dumping data for table `cours`
--

INSERT INTO `cours` (`ID_cours`, `nom`) VALUES
(1, 'POO Java'),
(2, 'Web dynamique'),
(3, 'Physique'),
(4, 'English');

--
-- Dumping data for table `enseignant`
--

INSERT INTO `enseignant` (`ID_utilisateur`, `ID_cours`) VALUES
(3, 1),
(4, 4),
(5, 2),
(6, 3),
(21, 2);

--
-- Dumping data for table `groupe`
--

INSERT INTO `groupe` (`ID_groupe`, `Nom`, `ID_promotion`) VALUES
(1, 'Gr01', 1),
(2, 'Gr02', 1),
(3, 'Gr01', 2),
(4, 'Gr02', 2),
(5, 'Gr02', 3),
(6, 'Gr10', 3);

--
-- Dumping data for table `promotion`
--

INSERT INTO `promotion` (`ID_promotion`, `nom`) VALUES
(1, 'Ing1'),
(2, 'Ing2'),
(3, 'Ing3');

--
-- Dumping data for table `salle`
--

INSERT INTO `salle` (`ID_salle`, `nom`, `capacite`, `ID_site`) VALUES
(1, 'P445', 93, 2),
(2, 'P437', 42, 2),
(3, 'Amphi 1', 421, 3),
(4, 'Amphi 2', 285, 3),
(5, 'EM009', 187, 1),
(6, 'EM118', 79, 1);

--
-- Dumping data for table `seance`
--

INSERT INTO `seance` (`ID_seance`, `semaine`, `date`, `heure_debut`, `heure_fin`, `etat`, `ID_cours`, `ID_type_cours`) VALUES
(1, 2, '2020-01-06', '08:30:00', '10:00:00', 2, 1, 2),
(2, 2, '2020-01-06', '10:15:00', '11:45:00', 2, 3, 1),
(3, 2, '2020-01-06', '12:00:00', '13:30:00', 2, 3, 2),
(4, 2, '2020-01-06', '13:45:00', '15:15:00', 1, 3, 1),
(5, 2, '2020-01-07', '08:30:00', '10:00:00', 2, 4, 2),
(6, 2, '2020-01-07', '08:30:00', '10:00:00', 2, 4, 2);

--
-- Dumping data for table `site`
--

INSERT INTO `site` (`ID_site`, `nom`) VALUES
(1, 'Eiffel 1'),
(2, 'Eiffel 2'),
(3, 'CNAM');

--
-- Dumping data for table `type_cours`
--

INSERT INTO `type_cours` (`ID_type_cours`, `nom`) VALUES
(1, 'cours interactif'),
(2, 'cours magistral'),
(3, 'TD'),
(4, 'TP'),
(5, 'soutien'),
(6, 'projet');

--
-- Dumping data for table `utilisateur`
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

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
