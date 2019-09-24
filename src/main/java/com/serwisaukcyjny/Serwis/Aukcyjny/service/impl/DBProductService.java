package com.serwisaukcyjny.Serwis.Aukcyjny.service.impl;

import com.serwisaukcyjny.Serwis.Aukcyjny.model.Product;
import com.serwisaukcyjny.Serwis.Aukcyjny.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Primary
@Transactional
@Service
public class DBProductService {

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init() {
        //todo: create liste of product
        //todo: put products into product table with productRepository

        productRepository.save(new Product(1L, "ps3","The last of Us","The last of Us", BigDecimal.valueOf(44.50),10,true,"19.jpg"));
        productRepository.save(new Product(2L, "ps3","Call of Duty: Modern Warfare 3","Call of Duty: Modern Warfare 3", BigDecimal.valueOf(38.90),1,false,"20.jpg"));
        productRepository.save(new Product(3L, "ps3","FIFA 19 - Edycja Legacy","FIFA 19 - Edycja Legacy", BigDecimal.valueOf(129.00),1,false, "21.jpg"));
        productRepository.save(new Product(4L, "ps3","Lego Jurassic World","Lego Jurassic World", BigDecimal.valueOf(85.00),1,false, "23.jpg"));
        productRepository.save(new Product(5L, "ps3","Grand Theft Auto V","Grand Theft Auto V", BigDecimal.valueOf(99.00),1,false, "22.jpg"));
        productRepository.save(new Product(6L, "ps3","Injustice","Injustice", BigDecimal.valueOf(85.00),1,false, "24.jpg"));
        productRepository.save(new Product(7L, "ps3","Dead Island","Dead Island", BigDecimal.valueOf(59.60),1,false, "25.jpg"));
        productRepository.save(new Product(8L, "ps3","Aliens Colonial Marines ","Aliens Colonial Marines ", BigDecimal.valueOf(170.99),1,false, "26.jpg"));
        productRepository.save(new Product(9L, "ps3","Darksiders II","Darksiders II", BigDecimal.valueOf(59.00),1,false, "27.jpg"));
        productRepository.save(new Product(10L, "ps3","DJ Hero 2","DJ Hero 2", BigDecimal.valueOf(35.00),1,false, "28.jpg"));
        productRepository.save(new Product(11L, "ps3","Middle-Earth Shadow of Mordor","Middle-Earth Shadow of Mordor", BigDecimal.valueOf(149.00),1,false, "29.jpg"));
        productRepository.save(new Product(12L, "ps3","Ben 10 Omniverse 2","Ben 10 Omniverse 2", BigDecimal.valueOf(71.00),1,true, "30.jpg"));
        productRepository.save(new Product(13L, "ps3","Mortal Kombat","Mortal Kombat", BigDecimal.valueOf(71.00),1,false, "31.jpg"));
        productRepository.save(new Product(14L, "ps3","Deus Ex: Bunt ludzkości","Deus Ex: Bunt ludzkości", BigDecimal.valueOf(171.00),1,false, "32.jpg"));
        productRepository.save(new Product(15L, "ps3","Thief","Thief", BigDecimal.valueOf(121.00),1,false, "33.jpg"));

        productRepository.save(new Product(16L, "ps4","FIFA 20 - Edycja mistrzowska","FIFA 20 - Edycja mistrzowska", BigDecimal.valueOf(299.00),1,true,"3.jpg"));
        productRepository.save(new Product(17L, "ps4","Cyberpunk 2077 - Edycja standardowa","Cyberpunk 2077 - Edycja standardowa", BigDecimal.valueOf(199.00),1,true,"2.jpg"));
        productRepository.save(new Product(18L, "ps4","Monster Hunter: World","Monster Hunter: World", BigDecimal.valueOf(89.99),1,false, "8.jpg"));
        productRepository.save(new Product(19L, "ps4","Need For Speed: Payback","Need For Speed: Payback", BigDecimal.valueOf(158.00),1,true, "7.jpg"));
        productRepository.save(new Product(20L, "ps4","Diablo 3 - Eternal Collection","Diablo 3 - Eternal Collection", BigDecimal.valueOf(109.00),1,false, "6.jpg"));
        productRepository.save(new Product(21L, "ps4","Minecraft","Minecraft", BigDecimal.valueOf(115.99),1,false, "13.jpg"));
        productRepository.save(new Product(22L, "ps4","Wiedźmin 3: Dziki Gon","Wiedźmin 3: Dziki Gon", BigDecimal.valueOf(157.00),1,true, "5.jpg"));
        productRepository.save(new Product(23L, "ps4","Dragon Ball Z: Kakarot","Dragon Ball Z: Kakarot", BigDecimal.valueOf(269.99),1,false, "15.jpg"));
        productRepository.save(new Product(24L, "ps4","Marvel's Avengers","Marvel's Avengers", BigDecimal.valueOf(132.00),1,true, "1.jpg"));
        productRepository.save(new Product(25L, "ps4","The Yakuza: Remastered","The Yakuza: Remastered", BigDecimal.valueOf(239.00),1,false, "11.jpg"));
        productRepository.save(new Product(26L, "ps4","Overwatch ","Overwatch ", BigDecimal.valueOf(109.00),1,false, "13.jpg"));
        productRepository.save(new Product(27L, "ps4","eFootball PES 2020","eFootball PES 2020", BigDecimal.valueOf(269.00),1,false, "4.jpg"));
        productRepository.save(new Product(28L, "ps4","PlayStation Network - 50 zł","PlayStation Network - 50 zł", BigDecimal.valueOf(50.00),1,true, "11.jpg"));
        productRepository.save(new Product(29L, "ps4","PlayStation Plus - 12 miesięcy","PlayStation Plus - 12 miesięcy", BigDecimal.valueOf(240.00),1,true, "10.jpg"));
        productRepository.save(new Product(30L, "ps4","PlayStation Plus - 3 miesiące","PlayStation Plus - 3 miesiące", BigDecimal.valueOf(100.00),1,false, "12.jpg"));


        productRepository.save(new Product(31L, "akcesoriaIkonsolePs","Konsola SONY PlayStation 4 Pro, 1 TB","Konsola SONY PlayStation 4 Pro, 1 TB", BigDecimal.valueOf(2360.00),1,false, "17.jpg"));
        productRepository.save(new Product(32L, "akcesoriaIkonsolePs","Konsola SONY PlayStation 4 Slim, 500 GB","Konsola SONY PlayStation 4 Slim, 500 GB", BigDecimal.valueOf(1980.00),1,false, "18.jpg"));
        productRepository.save(new Product(33L, "akcesoriaIkonsolePs","Pad Sony DualShock 4","Pad Sony DualShock 4", BigDecimal.valueOf(224.00),1,false, "16.jpg"));
        productRepository.save(new Product(34L, "akcesoriaIkonsolePs","Pad Sony DualShock 4","Pad Sony DualShock 4", BigDecimal.valueOf(224.00),1,false, "34.jpg"));
        productRepository.save(new Product(35L, "akcesoriaIkonsolePs","Pad Sony DualShock 4","Pad Sony DualShock 4", BigDecimal.valueOf(224.00),1,false, "35.jpg"));
        productRepository.save(new Product(36L, "akcesoriaIkonsolePs","Konsola SONY PlayStation 3 Slim, 500 GB","Konsola SONY PlayStation 3 Slim, 500 GB", BigDecimal.valueOf(890.00),1,false, "36.jpg"));

        productRepository.save(new Product(37L, "xbox360","Grand Theft Auto V","Grand Theft Auto V", BigDecimal.valueOf(65.00),1,true,"37.jpg"));
        productRepository.save(new Product(38L, "xbox360","The Sims 3","The Sims 3", BigDecimal.valueOf(120.00),1,true,"38.jpg"));
        productRepository.save(new Product(39L, "xbox360","Assassin's Creed II","Assassin's Creed II", BigDecimal.valueOf(59.99),1,false, "39.jpg"));
        productRepository.save(new Product(40L, "xbox360","Harry Potter and the Deathly Hallows Part 2","Harry Potter and the Deathly Hallows Part 2", BigDecimal.valueOf(49.00),1,true, "40.jpg"));
        productRepository.save(new Product(41L, "xbox360","Battlefield 4","Battlefield 4", BigDecimal.valueOf(109.00),1,false, "41.jpg"));
        productRepository.save(new Product(42L, "xbox360","LEGO: Marvel Super Heroes","LEGO: Marvel Super Heroes", BigDecimal.valueOf(85.00),1,false, "42.jpg"));
        productRepository.save(new Product(43L, "xbox360","The Evil Within","The Evil Within", BigDecimal.valueOf(39.00),1,true, "43.jpg"));
        productRepository.save(new Product(44L, "xbox360","Persona 4: Arena","Persona 4: Arena", BigDecimal.valueOf(39.99),1,false, "44.jpg"));
        productRepository.save(new Product(45L, "xbox360","Guitar Hero Metallica","Guitar Hero Metallica", BigDecimal.valueOf(29.99),1,true, "45.jpg"));
        productRepository.save(new Product(46L, "xbox360","Tomb Raider - Anniversary","Tomb Raider - Anniversary", BigDecimal.valueOf(44.99),1,false, "46.jpg"));
        productRepository.save(new Product(47L, "xbox360","Bulletstorm ","Bulletstorm ", BigDecimal.valueOf(109.00),1,false, "47.jpg"));
        productRepository.save(new Product(48L, "xbox360","Need for Speed Rivals","Need for Speed Rivals", BigDecimal.valueOf(79.00),1,false, "48.jpg"));
        productRepository.save(new Product(49L, "xbox360","South Park: Kijek Prawdy","South Park: Kijek Prawdy", BigDecimal.valueOf(59.00),1,true, "49.jpg"));
        productRepository.save(new Product(50L, "xbox360","Homefront","Homefront", BigDecimal.valueOf(60.00),1,true, "50.jpg"));
        productRepository.save(new Product(51L, "xbox360","Rayman Legends","Rayman Legends", BigDecimal.valueOf(89.00),1,false, "51.jpg"));

        productRepository.save(new Product(52L, "akcesoriaIkonsoleXbox","Konsola Microsoft Xbox 360 250GB ","Konsola Microsoft Xbox 360 250GB ", BigDecimal.valueOf(900.00),1,false, "52.jpg"));
        productRepository.save(new Product(53L, "akcesoriaIkonsoleXbox","Konsola MICROSOFT Xbox One S, 1 TB","Konsola MICROSOFT Xbox One S, 1 TB", BigDecimal.valueOf(1300.00),1,false, "53.jpg"));
        productRepository.save(new Product(54L, "akcesoriaIkonsoleXbox","PAD Kontroler Xbox One S","PAD Kontroler Xbox One S", BigDecimal.valueOf(169.99),1,false, "54.jpg"));

        productRepository.save(new Product(55L, "xboxOne","Rayman Legends","Rayman Legends", BigDecimal.valueOf(78.99),1,true,"55.jpg"));
        productRepository.save(new Product(56L, "xboxOne","The Sims 4","The Sims 4", BigDecimal.valueOf(132.99),1,true,"56.jpg"));
        productRepository.save(new Product(57L, "xboxOne","Marvel's Avengers","Marvel's Avengers", BigDecimal.valueOf(279.99),1,false, "57.jpg"));
        productRepository.save(new Product(58L, "xboxOne","Grand Theft Auto V","Grand Theft Auto V", BigDecimal.valueOf(109.00),1,true, "58.jpg"));
        productRepository.save(new Product(59L, "xboxOne","Tom Clancy's Ghost Recon: Wildlands","Tom Clancy's Ghost Recon: Wildlands", BigDecimal.valueOf(111.99),1,false, "59.jpg"));
        productRepository.save(new Product(60L, "xboxOne","Wiedźmin 3 - Dziki Gon","Wiedźmin 3 - Dziki Gon", BigDecimal.valueOf(105.00),1,false, "60.jpg"));
        productRepository.save(new Product(61L, "xboxOne","Final Fantasy XV Day One Edition","Final Fantasy XV Day One Edition", BigDecimal.valueOf(44.99),1,true, "61.jpg"));
        productRepository.save(new Product(62L, "xboxOne","NBA 2K20","NBA 2K20", BigDecimal.valueOf(281.99),1,false, "62.jpg"));
        productRepository.save(new Product(63L, "xboxOne","Just Dance 2020","Just Dance 2020", BigDecimal.valueOf(174.99),1,true, "63.jpg"));
        productRepository.save(new Product(64L, "xboxOne","Plants vs. Zombies: Bitwa o Neighborville","Plants vs. Zombies: Bitwa o Neighborville", BigDecimal.valueOf(139.99),1,false, "64.jpg"));
        productRepository.save(new Product(65L, "xboxOne","FIFA 19 ","FIFA 19 ", BigDecimal.valueOf(165.99),1,false, "65.jpg"));
        productRepository.save(new Product(66L, "xboxOne","Jumanji: The Video Game","Jumanji: The Video Game", BigDecimal.valueOf(159.99),1,false, "66.jpg"));
        productRepository.save(new Product(67L, "xboxOne","Red Dead Redemption 2","Red Dead Redemption 2", BigDecimal.valueOf(281.99),1,true, "67.jpg"));
        productRepository.save(new Product(68L, "xboxOne","Destiny 2","Destiny 2", BigDecimal.valueOf(130.00),1,true, "68.jpg"));
        productRepository.save(new Product(69L, "xboxOne","Need for Speed: Heat","Need for Speed: Heat", BigDecimal.valueOf(244.99),1,false, "69.jpg"));

        productRepository.save(new Product(70L, "nintendoSwitch","Spyro Reignited Trilogy","Spyro Reignited Trilogy", BigDecimal.valueOf(164.99),1,true,"70.jpg"));
        productRepository.save(new Product(71L, "nintendoSwitch","Wiedźmin 3: Dziki Gon","Wiedźmin 3: Dziki Gon", BigDecimal.valueOf(249.99),1,true,"71.jpg"));
        productRepository.save(new Product(72L, "nintendoSwitch","FIFA 20","FIFA 20", BigDecimal.valueOf(169.99),1,false, "72.jpg"));
        productRepository.save(new Product(73L, "nintendoSwitch","Darksiders II - Deathinitive Edition","Darksiders II - Deathinitive Edition", BigDecimal.valueOf(119.99),1,true, "73.jpg"));
        productRepository.save(new Product(74L, "nintendoSwitch","LEGO Gwiezdne Wojny: Skywalker","LEGO Gwiezdne Wojny: Skywalker", BigDecimal.valueOf(230.00),1,false, "74.jpg"));
        productRepository.save(new Product(75L, "nintendoSwitch","Crash Team Racing: Nitro-Fueled","Crash Team Racing: Nitro-Fueled", BigDecimal.valueOf(169.99),1,false, "75.jpg"));
        productRepository.save(new Product(76L, "nintendoSwitch","Ice Age: Scrat's Nutty Adventure","Ice Age: Scrat's Nutty Adventure", BigDecimal.valueOf(169.99),1,true, "76.jpg"));
        productRepository.save(new Product(77L, "nintendoSwitch","Final Fantasy X-X2 - Remastered","Final Fantasy X-X2 - Remastered", BigDecimal.valueOf(171.99),1,false, "77.jpg"));
        productRepository.save(new Product(78L, "nintendoSwitch","Wolfenstein: Youngblood - Deluxe Edition","Wolfenstein: Youngblood - Deluxe Edition", BigDecimal.valueOf(160.99),1,true, "78.jpg"));
        productRepository.save(new Product(79L, "nintendoSwitch","Team Sonic Racing","Team Sonic Racing", BigDecimal.valueOf(149.99),1,false, "79.jpg"));
        productRepository.save(new Product(80L, "nintendoSwitch","Sniper Elite III - Ultimate Edition ","Sniper Elite III - Ultimate Edition", BigDecimal.valueOf(159.99),1,false, "80.jpg"));
        productRepository.save(new Product(81L, "nintendoSwitch","Fortnite","Fortnite", BigDecimal.valueOf(119.99),1,false, "81.jpg"));
        productRepository.save(new Product(82L, "nintendoSwitch","Naruto Shippuden","Naruto Shippuden", BigDecimal.valueOf(199.99),1,true, "82.jpg"));
        productRepository.save(new Product(83L, "nintendoSwitch","The Walking Dead","The Walking Dead", BigDecimal.valueOf(169.99),1,true, "83.jpg"));
        productRepository.save(new Product(84L, "nintendoSwitch","NBA 2K20","NBA 2K20", BigDecimal.valueOf(244.99),1,false, "84.jpg"));

        productRepository.save(new Product(85L, "akcesoriaIkonsoleNintendo","Konsola NINTENDO Switch ","Konsola NINTENDO Switch", BigDecimal.valueOf(1315.00),1,false, "85.jpg"));
        productRepository.save(new Product(86L, "akcesoriaIkonsoleNintendo","Konsola Nintendo 2DS XL","Konsola Nintendo 2DS XL", BigDecimal.valueOf(500.00),1,false, "86.jpg"));

        productRepository.save(new Product(87L, "nintendoWiiU","Bayonetta","Bayonetta", BigDecimal.valueOf(49.00),1,false,"87.jpg"));
        productRepository.save(new Product(88L, "nintendoWiiU","Mario Kart 8","Mario Kart 8", BigDecimal.valueOf(99.00),1,false,"88.jpg"));
        productRepository.save(new Product(89L, "nintendoWiiU","The Legend of Zelda","The Legend of Zelda", BigDecimal.valueOf(169.99),1,false, "89.jpg"));
        productRepository.save(new Product(90L, "nintendoWiiU","Tekken Tag Tournament 2","Tekken Tag Tournament 2", BigDecimal.valueOf(79.99),1,false, "90.jpg"));
        productRepository.save(new Product(91L, "nintendoWiiU","Tokyo Mirage","Tokyo Mirage", BigDecimal.valueOf(175.99),1,false, "91.jpg"));
        productRepository.save(new Product(92L, "nintendoWiiU","Nintendo Land","Nintendo Land", BigDecimal.valueOf(40.00),1,false, "92.jpg"));
        productRepository.save(new Product(93L, "nintendoWiiU","Donkey Kong Country Tropical","Donkey Kong Country Tropical", BigDecimal.valueOf(169.99),1,false, "93.jpg"));
        productRepository.save(new Product(94L, "nintendoWiiU","Minecraft","Minecraft", BigDecimal.valueOf(141.99),1,false, "94.jpg"));
        productRepository.save(new Product(95L, "nintendoWiiU","Monster Hunter 3 ","Monster Hunter 3 ", BigDecimal.valueOf(160.99),1,false, "95.jpg"));
        productRepository.save(new Product(96L, "nintendoWiiU","Super Smash Bros","Super Smash Bros", BigDecimal.valueOf(149.99),1,false, "96.jpg"));
        productRepository.save(new Product(97L, "nintendoWiiU","Mario Party 10","Mario Party 10", BigDecimal.valueOf(99.99),1,false, "97.jpg"));
        productRepository.save(new Product(98L, "nintendoWiiU","LEGO City Undercover","LEGO City Undercover", BigDecimal.valueOf(119.99),1,false, "98.jpg"));
        productRepository.save(new Product(99L, "nintendoWiiU","Wii Party","Wii Party", BigDecimal.valueOf(50.99),1,false, "99.jpg"));
        productRepository.save(new Product(100L, "nintendoWiiU","Mario Tennis","Mario Tennis", BigDecimal.valueOf(169.99),1,false, "100.jpg"));
        productRepository.save(new Product(101L, "nintendoWiiU","Super Mario 3D","Super Mario 3D", BigDecimal.valueOf(99.00),1,false, "101.jpg"));

        productRepository.save(new Product(102L, "nintendoWii","Harvest Moon Magical Melodies","Harvest Moon Magical Melodies", BigDecimal.valueOf(34.99),1,false,"102.jpg"));
        productRepository.save(new Product(103L, "nintendoWii","Sonic and the Secret Rings","Sonic and the Secret Rings", BigDecimal.valueOf(49.99),1,false,"103.jpg"));
        productRepository.save(new Product(104L, "nintendoWii","The Legend of Zelda Twilight Princess","The Legend of Zelda Twilight Princess", BigDecimal.valueOf(169.99),1,false, "104.jpg"));
        productRepository.save(new Product(105L, "nintendoWii","The Godfather: Blackhand","The Godfather: Blackhand", BigDecimal.valueOf(59.99),1,false, "105.jpg"));
        productRepository.save(new Product(106L, "nintendoWii","Ice Age 2: The Meltdown","Ice Age 2: The Meltdown", BigDecimal.valueOf(34.00),1,false, "106.jpg"));
        productRepository.save(new Product(107L, "nintendoWii","Monopoly","Monopoly", BigDecimal.valueOf(69.99),1,false, "107.jpg"));
        productRepository.save(new Product(108L, "nintendoWii","Harry Potter and the Order of the Phoenix","Harry Potter and the Order of the Phoenix", BigDecimal.valueOf(69.99),1,false, "108.jpg"));
        productRepository.save(new Product(109L, "nintendoWii","Need for Speed ProStreet","Need for Speed ProStreet", BigDecimal.valueOf(47.99),1,false, "109.jpg"));
        productRepository.save(new Product(110L, "nintendoWii","Mario Kart","Mario Kart", BigDecimal.valueOf(60.99),1,false, "110.jpg"));
        productRepository.save(new Product(111L, "nintendoWii","Mario Party 9","Mario Party 9", BigDecimal.valueOf(67.00),1,false, "111.jpg"));
        productRepository.save(new Product(112L, "nintendoWii","Super Paper Mario ","Super Paper Mario ", BigDecimal.valueOf(59.99),1,false, "112.jpg"));
        productRepository.save(new Product(113L, "nintendoWii","New Super Mario Bros","New Super Mario Bros", BigDecimal.valueOf(39.99),1,false, "113.jpg"));
        productRepository.save(new Product(114L, "nintendoWii","Super Mario Galaxy ","Super Mario Galaxy ", BigDecimal.valueOf(49.99),1,false, "114.jpg"));
        productRepository.save(new Product(115L, "nintendoWii","Mario Party 8","Mario Party 8", BigDecimal.valueOf(69.99),1,false, "115.jpg"));
        productRepository.save(new Product(116L, "nintendoWii","Super Smash Bros","Super Smash Bros", BigDecimal.valueOf(44.99),1,false, "116.jpg"));

        productRepository.save(new Product(117L, "nintendoDs-3Ds","Pokemon X","Pokemon X", BigDecimal.valueOf(64.99),1,false,"117.jpg"));
        productRepository.save(new Product(118L, "nintendoDs-3Ds","Mario & Luigi Superstar Saga","Mario & Luigi Superstar Saga", BigDecimal.valueOf(49.99),1,false,"118.jpg"));
        productRepository.save(new Product(119L, "nintendoDs-3Ds","LEGO Star Wars: The Force Awakens","LEGO Star Wars: The Force Awakens", BigDecimal.valueOf(69.99),1,false, "119.jpg"));
        productRepository.save(new Product(120L, "nintendoDs-3Ds","Kingdom Hearts 358/2","Kingdom Hearts 358/2", BigDecimal.valueOf(39.99),1,false, "120.jpg"));
        productRepository.save(new Product(121L, "nintendoDs-3Ds","The Legend of Zelda Spirit Tracks","The Legend of Zelda Spirit Tracks", BigDecimal.valueOf(30.00),1,false, "121.jpg"));
        productRepository.save(new Product(122L, "nintendoDs-3Ds","Yoshi's Island NDS","Yoshi's Island NDS", BigDecimal.valueOf(69.99),1,false, "122.jpg"));
        productRepository.save(new Product(123L, "nintendoDs-3Ds","Dragon Ball Z Goku Densetsu NDS ","Dragon Ball Z Goku Densetsu NDS ", BigDecimal.valueOf(69.99),1,false, "123.jpg"));
        productRepository.save(new Product(124L, "nintendoDs-3Ds","Harvest Moon DS używana NDS","Harvest Moon DS używana NDS", BigDecimal.valueOf(71.99),1,false, "124.jpg"));
        productRepository.save(new Product(125L, "nintendoDs-3Ds","Pokemon White Version NDS","Pokemon White Version NDS", BigDecimal.valueOf(60.99),1,false, "125.jpg"));
        productRepository.save(new Product(126L, "nintendoDs-3Ds","The Legend of Zelda Phantom Hourglass NDS","The Legend of Zelda Phantom Hourglass NDS", BigDecimal.valueOf(49.99),1,false, "126.jpg"));
        productRepository.save(new Product(127L, "nintendoDs-3Ds","New Super Mario Bros NDS ","New Super Mario Bros NDS", BigDecimal.valueOf(59.99),1,false, "127.jpg"));
        productRepository.save(new Product(128L, "nintendoDs-3Ds","Kirby Mouse Attack NDS","Kirby Mouse Attack NDS", BigDecimal.valueOf(39.99),1,false, "128.jpg"));
        productRepository.save(new Product(129L, "nintendoDs-3Ds","Mario & Luigi Paper Jam 3DS","Mario & Luigi Paper Jam 3DS", BigDecimal.valueOf(49.99),1,false, "129.jpg"));
        productRepository.save(new Product(130L, "nintendoDs-3Ds","Rayman Origins 3DS ","Rayman Origins 3DS ", BigDecimal.valueOf(69.99),1,false, "130.jpg"));
        productRepository.save(new Product(131L, "nintendoDs-3Ds","The Legend of Zelda Majora's Mask 3DS","The Legend of Zelda Majora's Mask 3DS", BigDecimal.valueOf(129.99),1,false, "131.jpg"));

        productRepository.save(new Product(132L, "pc","The Sims 4: Wyspiarskie Życie","The Sims 4: Wyspiarskie Życie", BigDecimal.valueOf(115.99),1,false,"132.jpg"));
        productRepository.save(new Product(133L, "pc","Call of Duty: Modern Warfare 3","Call of Duty: Modern Warfare 3", BigDecimal.valueOf(79.99),1,false,"133.jpg"));
        productRepository.save(new Product(134L, "pc","F1 2019","F1 2019", BigDecimal.valueOf(169.99),1,false, "134.jpg"));
        productRepository.save(new Product(135L, "pc","Final Fantasy XIV","Final Fantasy XIV", BigDecimal.valueOf(149.99),1,false, "135.jpg"));
        productRepository.save(new Product(136L, "pc","WRC 8","WRC 8", BigDecimal.valueOf(130.00),1,false, "136.jpg"));
        productRepository.save(new Product(137L, "pc","Monster Hunter: World","Monster Hunter: World", BigDecimal.valueOf(89.99),1,false, "137.jpg"));
        productRepository.save(new Product(138L, "pc","Diablo 3","Diablo 3", BigDecimal.valueOf(79.99),1,true, "138.jpg"));
        productRepository.save(new Product(139L, "pc","Overwatch","Overwatch", BigDecimal.valueOf(161.99),1,true, "139.jpg"));
        productRepository.save(new Product(140L, "pc","Far Cry 5","Far Cry 5", BigDecimal.valueOf(105.99),1,true, "140.jpg"));
        productRepository.save(new Product(141L, "pc","Grand Theft Auto V","Grand Theft Auto V", BigDecimal.valueOf(149.99),1,false, "141.jpg"));
        productRepository.save(new Product(142L, "pc","Wiedźmin 3","Wiedźmin 3", BigDecimal.valueOf(159.99),1,false, "142.jpg"));
        productRepository.save(new Product(143L, "pc","Need for Speed: Payback","Need for Speed: Payback", BigDecimal.valueOf(59.99),1,false, "143.jpg"));
        productRepository.save(new Product(144L, "pc","South Park: The Fractured But Whole","South Park: The Fractured But Whole", BigDecimal.valueOf(79.99),1,false, "144.jpg"));
        productRepository.save(new Product(145L, "pc","Need For Speed","Need For Speed", BigDecimal.valueOf(69.99),1,true, "145.jpg"));
        productRepository.save(new Product(146L, "pc","Plants vs Zombies: Garden Warfare 2","Plants vs Zombies: Garden Warfare 2", BigDecimal.valueOf(129.99),1,true, "146.jpg"));


        productRepository.save(new Product(147L, "przedsprzedaż","Need For Speed","Need For Speed", BigDecimal.valueOf(69.99),1,false, "145.jpg"));
        productRepository.save(new Product(148L, "przedsprzedaż","Far Cry 5","Far Cry 5", BigDecimal.valueOf(105.99),1,false, "140.jpg"));
        productRepository.save(new Product(149L, "przedsprzedaż","Diablo 3","Diablo 3", BigDecimal.valueOf(79.99),1,false, "138.jpg"));
        productRepository.save(new Product(150L, "przedsprzedaż","Overwatch","Overwatch", BigDecimal.valueOf(161.99),1,false, "139.jpg"));
        productRepository.save(new Product(151L, "przedsprzedaż","NBA 2K20","NBA 2K20", BigDecimal.valueOf(281.99),1,false, "62.jpg"));
        productRepository.save(new Product(152L, "przedsprzedaż","FIFA 20 - Edycja mistrzowska","FIFA 20 - Edycja mistrzowska", BigDecimal.valueOf(299.00),1,false,"3.jpg"));
        productRepository.save(new Product(153L, "przedsprzedaż","Need for Speed: Heat","Need for Speed: Heat", BigDecimal.valueOf(244.99),1,false, "69.jpg"));
        productRepository.save(new Product(154L, "przedsprzedaż","Marvel's Avengers","Marvel's Avengers", BigDecimal.valueOf(279.99),1,false, "57.jpg"));
        productRepository.save(new Product(155L, "przedsprzedaż","eFootball PES 2020","eFootball PES 2020", BigDecimal.valueOf(269.00),1,false, "4.jpg"));
        productRepository.save(new Product(156L, "przedsprzedaż","FIFA 20 - Edycja mistrzowska","FIFA 20 - Edycja mistrzowska", BigDecimal.valueOf(299.00),1,false,"3.jpg"));
        productRepository.save(new Product(157L, "przedsprzedaż","Cyberpunk 2077 - Edycja standardowa","Cyberpunk 2077 - Edycja standardowa", BigDecimal.valueOf(199.00),1,false,"9.jpg"));
        productRepository.save(new Product(158L, "przedsprzedaż","Marvel's Avengers","Marvel's Avengers", BigDecimal.valueOf(132.00),1,false, "1.jpg"));
        productRepository.save(new Product(159L, "przedsprzedaż","Plants vs. Zombies: Bitwa o Neighborville","Plants vs. Zombies: Bitwa o Neighborville", BigDecimal.valueOf(139.99),1,false, "64.jpg"));
        productRepository.save(new Product(160L, "przedsprzedaż","Crash Team Racing: Nitro-Fueled","Crash Team Racing: Nitro-Fueled", BigDecimal.valueOf(169.99),1,false, "75.jpg"));
        productRepository.save(new Product(161L, "przedsprzedaż","NBA 2K20","NBA 2K20", BigDecimal.valueOf(244.99),1,false, "84.jpg"));


    }
}
