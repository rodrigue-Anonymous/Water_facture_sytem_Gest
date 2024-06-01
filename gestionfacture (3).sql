-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 28 fév. 2024 à 15:41
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionfacture`
--

-- --------------------------------------------------------

--
-- Structure de la table `agent`
--

CREATE TABLE `agent` (
  `IdAgent` int(5) NOT NULL,
  `NomAgent` varchar(30) NOT NULL,
  `PrenomAgent` varchar(60) NOT NULL,
  `TelAgent` int(8) NOT NULL,
  `EmailAgent` varchar(60) NOT NULL,
  `FonctionAgent` varchar(30) NOT NULL,
  `CodePersonnel` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `agent`
--

INSERT INTO `agent` (`IdAgent`, `NomAgent`, `PrenomAgent`, `TelAgent`, `EmailAgent`, `FonctionAgent`, `CodePersonnel`) VALUES
(4, 'Djaba', 'Albert', 63232521, 'Albert@gmail.com', 'Controleur', 'A202411'),
(6, 'kakpo', 'Djaba', 60665520, 'Albert@gmail.com', 'controleur', 'A202441');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `IdClient` int(5) NOT NULL,
  `NomClient` varchar(30) NOT NULL,
  `PrenomClient` varchar(60) NOT NULL,
  `ContactClient` int(15) NOT NULL,
  `EmailClient` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`IdClient`, `NomClient`, `PrenomClient`, `ContactClient`, `EmailClient`) VALUES
(35, 'patint', 'ALMMKL', 947512356, 'YYGTYAFGTFATFAT'),
(36, 'dalko', 'eric', 98987876, 'regi@gmailcom');

-- --------------------------------------------------------

--
-- Structure de la table `compteur`
--

CREATE TABLE `compteur` (
  `Police` int(10) NOT NULL,
  `IdClient` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `compteur`
--

INSERT INTO `compteur` (`Police`, `IdClient`) VALUES
(565223122, 35),
(94713020, 36);

-- --------------------------------------------------------

--
-- Structure de la table `consulter`
--

CREATE TABLE `consulter` (
  `DateConsultation` date NOT NULL,
  `VolumeConsomme` int(4) DEFAULT NULL,
  `Police` int(10) NOT NULL,
  `IdAgent` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE `facture` (
  `IdFacture` int(8) NOT NULL,
  `DateEmission` datetime NOT NULL,
  `MontantTotal` int(5) NOT NULL,
  `Police` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `facture`
--

INSERT INTO `facture` (`IdFacture`, `DateEmission`, `MontantTotal`, `Police`) VALUES
(7, '2024-02-28 12:13:59', 4752, 94713020),
(8, '2024-02-28 13:09:00', 0, 94713020),
(9, '2024-02-28 13:10:35', 7128, 94713020),
(10, '2024-02-28 13:11:45', 7128, 94713020),
(11, '2024-02-28 14:06:39', 4752, 94713020);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `agent`
--
ALTER TABLE `agent`
  ADD PRIMARY KEY (`IdAgent`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`IdClient`);

--
-- Index pour la table `compteur`
--
ALTER TABLE `compteur`
  ADD PRIMARY KEY (`Police`),
  ADD KEY `IdClient` (`IdClient`);

--
-- Index pour la table `consulter`
--
ALTER TABLE `consulter`
  ADD KEY `Police` (`Police`),
  ADD KEY `IdAgent` (`IdAgent`);

--
-- Index pour la table `facture`
--
ALTER TABLE `facture`
  ADD PRIMARY KEY (`IdFacture`),
  ADD KEY `Police` (`Police`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `agent`
--
ALTER TABLE `agent`
  MODIFY `IdAgent` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `client`
--
ALTER TABLE `client`
  MODIFY `IdClient` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT pour la table `facture`
--
ALTER TABLE `facture`
  MODIFY `IdFacture` int(8) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `compteur`
--
ALTER TABLE `compteur`
  ADD CONSTRAINT `compteur_ibfk_1` FOREIGN KEY (`IdClient`) REFERENCES `client` (`IdClient`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `consulter`
--
ALTER TABLE `consulter`
  ADD CONSTRAINT `consulter_ibfk_1` FOREIGN KEY (`Police`) REFERENCES `compteur` (`Police`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `consulter_ibfk_2` FOREIGN KEY (`IdAgent`) REFERENCES `agent` (`IdAgent`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `facture`
--
ALTER TABLE `facture`
  ADD CONSTRAINT `facture_ibfk_1` FOREIGN KEY (`Police`) REFERENCES `compteur` (`Police`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
