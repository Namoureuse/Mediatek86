-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : ven. 02 juil. 2021 à 09:56
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : coach
--

-- --------------------------------------------------------

--
-- Structure de la table profil
--

DROP TABLE IF EXISTS profil;
CREATE TABLE IF NOT EXISTS profil (
  datemesure datetime NOT NULL,
  poids int(3) NOT NULL,
  taille int(3) NOT NULL,
  age int(3) NOT NULL,
  sexe int(1) NOT NULL,
  PRIMARY KEY (datemesure)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Déchargement des données de la table profil
--

INSERT INTO profil (datemesure, poids, taille, age, sexe) VALUES
('2021-07-01 14:40:13', 44, 144, 42, 0),
('2021-07-01 20:34:04', 45, 160, 40, 0),
('2021-07-02 09:15:04', 160, 150, 65, 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
