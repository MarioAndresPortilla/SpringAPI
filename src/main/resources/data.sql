DELETE FROM weapon;


INSERT INTO `weapon`
(`id`,
`name`,
`description`,
`price`,
`status`)
VALUES
(1, 'AA-12 Shotgun','Automatic Assault Shotgun',81277,'Available'),
(2, 'Fully Auto USP .45','.45Caliber Fully-Automatic Pistol',154444,'Available'),
(3, 'Desert Eagle ','.50Caliber Semi-Automatic Pistol',34453,'Available'),
(4, 'S7 Sniper','U.N.S.C. Sniper Rifle',228005,'Available'),
(5, 'M400 Beam Rifle','High Voltage AR-19 Beam Rifle',85600,'Limited Availability'),
(6, 'GS Rocket Launcher','Double-Barreled Rocket Launcher',343343,'Unavailable'),
(7, 'BR85 Battle Rifle','Heavy Barrel Service Rifle',102033,'Available'),
(8, 'FN P90 SMG	','Compact Sub-Machine Gun',74453,'Available'),
(9, 'Skewer','Heavy Anti-Armor Sniper',975000,'Highly Classified'),
(10, 'Gravity Hammer','Insanely Powerful Device',100000000,'Unknown Alien Origin'),
(11, 'Needler','Fully-Auto Tracking Weapon',500750,'Unknown Alien Origin'),
(12, 'Pulse Carbine','Burst-Fire Plasma Weapon',350000,'Unknown Alien Origin'),
(13, 'MA40 AR','U.N.S.C. Assault Rifle',150000,'Available'),
(14, 'Cindershot','O.D.S.T. Grenade Launcher', 7000000,'Highly Classified');



DELETE FROM weapon
WHERE id = 19;
DELETE FROM weapon
WHERE id = 18;
