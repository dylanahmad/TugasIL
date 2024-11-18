package com.example.testjpcompose.data

import com.example.testjpcompose.R
import com.example.testjpcompose.model.About
import com.example.testjpcompose.model.Games

object DataProvider {
    val games =
        Games(
            id = 1,
            title = "Dota 2",
            genres = "MOBA",
            description = "Dota 2 adalah sebuah permainan arena pertarungan daring multipemain, dan merupakan sekuel dari Defense of the Ancients mod pada Warcraft 3: Reign of Chaos dan Warcraft 3: The Frozen Throne. ",
            gameImageId = R.drawable.dota2
        )
    val gamesList = listOf(
        games,
        Games(
            id = 2,
            title = "Assassin's Creed Odyssey",
            genres = "Action role-playing",
            description = "Assassin's Creed Odyssey is a tribute to the cultural heritage of Ancient Greece, its fascinating mythology, and the stories depicting Gods, heroes, monsters, and places. Many iconic mythical creatures have a role in the game's storyline in the form of missions that the player needs to complete.",
            gameImageId = R.drawable.acoddysey
        ),
        Games(
            id = 3,
            title = "Far Cry 6",
            genres = "First Person Shooter",
            description = "first-person shooter game where you play as Dani Rojas, a guerrilla fighter who attempts to liberate the fictional Caribbean island nation of Yara from a corrupt regime.",
            gameImageId = R.drawable.farcry6
        ),
        Games(
            id = 4,
            title = "EA Sports FC 25",
            genres = "simulation, Sports",
            description = " football video game published by EA Sports. It is the second instalment in the EA Sports FC series and the 32nd overall instalment of EA Sports' football simulation games..",
            gameImageId = R.drawable.fc25
        ),
        Games(
            id = 5,
            title = "Assassin's Creed Odyssey",
            genres = "Action role-playing",
            description = "Assassin's Creed Odyssey is a tribute to the cultural heritage of Ancient Greece, its fascinating mythology, and the stories depicting Gods, heroes, monsters, and places. Many iconic mythical creatures have a role in the game's storyline in the form of missions that the player needs to complete.",
            gameImageId = R.drawable.acoddysey
        ),
        Games(
            id = 6,
            title = "Football Manager 25",
            genres = "Sports management",
            description = "also known as Worldwide Soccer Manager in North America from 2004 to 2008, is a series of football management simulation video games developed by British developer Sports Interactive and published by Sega.",
            gameImageId = R.drawable.footballmanager25
        ),
        Games(
            id = 7,
            title = "Forza Horizon 5",
            genres = "Racing Simulator",
            description = " is a 2021 racing video game developed by Playground Games and published by Xbox Game Studios. It is the fifth Forza Horizon title and twelfth main instalment in the Forza series. The game is set in a fictionalised representation of Mexico..",
            gameImageId = R.drawable.forzahorizon5
        ),
        Games(
            id = 8,
            title = "Grand Theft Auto 6",
            genres = "Action-adventure-crime, open-world",
            description = "an upcoming video game in development by Rockstar Games. It is due to be the eighth main Grand Theft Auto game, following Grand Theft Auto V (2013), and the sixteenth entry overall. Set within the fictional open world state of Leonida—based on Florida—and its Miami-inspired Vice City, the story is expected to follow the criminal duo of Lucia and her male partner.",
            gameImageId = R.drawable.gta6
        ),
        Games(
            id = 9,
            title = "Mobile Legends",
            genres = "MOBA",
            description = "multiplayer online battle arena (MOBA) game designed for mobile phones. The game is free-to-play and is only monetized through in-game purchases like characters and skins. Each player can control a selectable character, called a Hero, with unique abilities and traits..",
            gameImageId = R.drawable.mobilelegends
        ),
        Games(
            id = 10,
            title = "Valorant",
            genres = "FPS, Tactical Shooter, Hero Shooter",
            description = "2020 first-person tactical hero shooter video game developed and published by Riot Games.[3] A free-to-play game, Valorant takes inspiration from the Counter-Strike series, borrowing several mechanics such as the buy menu, spray patterns, and inaccuracy while moving..",
            gameImageId = R.drawable.valorant
        ),
    )
    val mobileAbout = listOf(
        About(
            id = 1,
            nama = "Ahmad Dylan Fachrezy",
            email = "dylanahmad07.ad@gmail.com",
            jurusan = "Teknik Informatika",
            kampus = "Universitas Singaperbangsa Karawan",
            gameImageId = R.drawable.lanjet
        )
    )



}