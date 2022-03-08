

DELETE FROM product;





INSERT INTO `product`
(`id`,
`name`,
`detail`,
`price`,
`status`)
VALUES
(1, 'Korean Shoes','Best Winter Cloths',343,''),
(2, 'Design Cloths','Best Winter Cloths',444,''), 
(3, 'Auto Iron','Ultimate with Green Technology',94453,''), 
(4, 'New Arrival Cloth','Best Winter Cloths',678,''), 
(5, 'Old Fasion Cloth','Best Winter Cloths',456,''),
(6, 'Flactuated parts','Best Winter Cloths',343,''),
(7, 'New Seasonal Cloth','Best Winter Cloths',444,''), 
(8, 'Green Car Tools','Ultimate with Green Technology',94453,''),
(9, 'New ACloth','Best Winter Cloths',678,''),
(10, 'Old Cloth','Best Winter Cloths',456,'');





DELETE FROM product
WHERE id = 11;
DELETE FROM product
WHERE id = 12;
