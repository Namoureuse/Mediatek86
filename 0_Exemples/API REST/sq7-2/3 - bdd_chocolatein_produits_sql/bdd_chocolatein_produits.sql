
-- --------------------------------
-- Création de la table "produit" -
-- --------------------------------
CREATE TABLE produit (
  id integer NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nom text,
  description text,
  packaging text,
  urlimg text,
  gamme varchar(25)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- -----------------------------------
-- Remplissage de la table "produit" -
-- -----------------------------------
INSERT INTO produit (id, nom, description, packaging, urlimg, gamme) VALUES
(1, 'Ballotins', 'Ballotins à composer directement devant les présentoirs.', 'de 125 g à 1000 g', './vues/images/produits/chocolats/ballotins', 'chocolats'),
(2, 'Berlingots ', 'Assortiment de différents parfums de berlingots', 'en bonbonnière', './vues/images/produits/confiseries/berlingots', 'confiseries'),
(3, 'Boite de luxe', 'Boite de luxe', 'de 4 à 49 chocolats', './vues/images/produits/chocolats/luxe', 'chocolats'),
(4, 'Bonbons à la cerise et au piment d’Espelette', 'Surprenant par ses épices et son caractère, c\'est le fleuron du Pays Basque.', 'en bonbonnière', './vues/images/produits/confiseries/piment-espelette', 'confiseries'),
(5, 'Bonbons à la sève de pin', 'Un bonbon traditionnel à la saveur des montagnes qui désencombre les sinus.', 'en bonbonnière', './vues/images/produits/confiseries/seve-pin', 'confiseries'),
(6, 'Cadeau convive cube', 'Dragées présentées dans un élégant cube de plexiglas.', '120 grammes', './vues/images/produits/dragees/cadeau-convive-cube', 'dragees'),
(7, 'Cadeau convive en bonbonnière', 'Dragées présentées dans une bonbonnière en verre surplombée d\'un petit garçon ou d\'une petite fille.', '180 grammes', './vues/images/produits/dragees/cadeau-convive-pot', 'dragees'),
(8, 'Élégant sachet de dragées', 'Dragées dans une boule en plastique présentées dans un élégant sachet.', '90 grammes', './vues/images/produits/dragees/cadeau-convive-sachet', 'dragees'),
(9, 'Choc\' o\' lait', 'Carré de chocolat à faire fondre dans du lait chaud.', '33 grammes', './vues/images/produits/saison/choc-o-lait', 'produits_de_saison'),
(10, 'Citrouille', 'En praliné au lait...', '50 grammes', './vues/images/produits/saison/citrouille', 'produits_de_saison'),
(11, 'Coffret de 27 tablettes', 'Coffret de 27 tablettes', '270 grammes', './vues/images/produits/chocolats/tablettes27', 'chocolats'),
(12, 'Dragées amandes corsées', 'Nappées de fin chocolat noir aux notes chaudes de brioche et de miel. Pour garnir les cadeaux de vos invités.', 'Environ 80 dragées pour 250g', './vues/images/produits/dragees/dragees-amandes-corsees', 'dragees'),
(13, 'Dragées amandes finesse extrême', 'Amande fraîche au goût délicat de la douce amertume. Pour garnir les cadeaux de vos invités.', 'Environ 85 dragées pour 250g', './vues/images/produits/dragees/dragees-amandes-finesse-extreme', 'dragees'),
(14, 'Dragées Petits Coeurs', 'Du bon chocolat au lait moulé avec une finition au sucre coloré. Pour garnir les cadeaux de vos invités.', '250 grammes', './vues/images/produits/dragees/dragees-chocolat', 'dragees'),
(15, 'Escarpin en chocolat', 'Un palet mendiant est à l\'avant de la chaussure en chocolat.', 'un cadeau original', './vues/images/produits/idees_cadeaux/chaussure-noire', 'idees_cadeaux'),
(16, 'Escarpin en chocolat rose', 'Talon haut en chocolat blanc, coloré en rouge betterave. Intérieur en chocolat au lait.', 'un cadeau original', './vues/images/produits/idees_cadeaux/chaussure-rose', 'idees_cadeaux'),
(17, 'Feuilles d\'automne', 'Chocolats pralinés sous différentes formes...', '180 grammes', './vues/images/produits/saison/feuilles_automne', 'produits_de_saison'),
(18, 'Gâteau de bonbons', 'Assemblage de bonbons en forme de gâteau fourni dans une boîte de luxe', 'tout en élégance', './vues/images/produits/confiseries/gateau-bonbons', 'confiseries'),
(19, 'Grêlons', 'Noisettes caramélisées, enrobées de chocolat au lait, puis légèrement saupoudrées de sucre glace.', '150 grammes ou vrac', './vues/images/produits/dragees/grelons', 'dragees'),
(20, 'Hérisson', 'Chocolat praliné blanc ou lait.', 'environ 25 grammes', './vues/images/produits/saison/herisson', 'produits_de_saison'),
(21, 'Mendiants', 'Composition de différents types de mendiants', '200 grammes', './vues/images/produits/chocolats/mendiants', 'chocolats'),
(22, 'Outils en chocolat noir', 'Excellent cadeau à offrir ou à s\'offrir pour toutes les occasions ! Anniversaire, Noël ou encore pour la Saint Valentin.', '5 outils', './vues/images/produits/idees_cadeaux/outils', 'idees_cadeaux'),
(23, 'Plateau traiteur', 'Plateau traiteur à composer devant les présentoirs.', '25 ou 49 chocolats', './vues/images/produits/chocolats/plateau', 'chocolats'),
(24, 'Pralines roses', 'Des amandes enveloppées de sucre cuit, une gourmandise dont il est difficile de se détacher.', '200 grammes', './vues/images/produits/saison/praline-rose', 'produits_de_saison'),
(25, 'Rose en chocolat', 'Réalisée en chocolat au lait, cette rose fondante est décorée à la main.', '80 grammes', './vues/images/produits/idees_cadeaux/rose', 'idees_cadeaux'),
(26, 'Tablettes', 'Tablettes de 70 grammes', '70 grammes', './vues/images/produits/chocolats/tablettes', 'chocolats');

