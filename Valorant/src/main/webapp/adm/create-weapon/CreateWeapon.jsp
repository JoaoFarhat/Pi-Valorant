<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
    <title>Armas</title>
    <link rel="stylesheet" href="CreateWeapon.css">
</head>
<body>
   <header>
        <div id="header-up">
            <a href="../home/home.jsp" class="logo-ancora" id=""><img class="" id="logo-navbar" src="images/logo.png" alt="logo"></a>
            <a href="../home/home.jsp" class="logo-ancora" id=""><h2 id="titulo-header">Visão Administrativa</h2></a>
        </div>
        <nav class="nav_links">
            <div class="nav_link">
                <a href="/agents"><img id="agent-icon" class="icon" src="images/agent-icon.png">Agentes</a>
            </div>
            <div class="nav_link">
                <a href= "/armas" ><img id="weapon-icon" class="icon" src="images/weapon-icon.png">Armas</a>
            </div>
            <div class="nav_link">
                <a href="/maps"><img id="map-icon" class="icon" src="images/map-icon.png">Mapas</a>
            </div>
            <div class="nav_link">
                <a href="/skins"><img id="skin-icon" class="icon" src="images/skin-icon.jpg">Skins</a>
            </div>
        </nav>
        <div id="header-down">
            <div id="div-ancora-button">
                <a href="../../" id="ancora-button"><button id="button_logout">LOG OUT</button></a>
            </div>
        </div>
    </header>
    <div id="div-right">
        <div id="div-form">
            <h2 id="form-title">Armas</h2>
            <form id="form-create-weapon" action="/create-weapon" method="post">
                <div id="colunas">
                    <div id="coluna-1">
                        <label>Name</label>
                        <input type="text" name="weapon-name" id="weapon-name" required>
                        <br>
                        <label>Type</label>
                            <input type="text" name="weapon-type" id="weapon-type" required>
                        <br>
                        <label>Creds</label>
                            <input type="number" name="weapon-creds" id="weapon-creds" required>
                        <br>
                        <label>Damage</label>
                            <input type="number" name="weapon-damage" id="weapon-damage" required>
                        <br>
                        <label>Magazine</label>
                            <input type="number" name="weapon-magazine" id="weapon-magazine" required>
                        <br>
                    </div>
                    <div id="coluna-2">
                        <label>Reserve</label>
                        <input type="number" name="weapon-reserve" id="weapon-reserve" required>
                        <br>
                        <label>Fire Rate per Seconds</label>
                            <input type="number" name="weapon-fireRateSecs" id="weapon-fireRateSecs" required>
                        <br>
                        <label>Wall Penetration</label>
                                <input type="text" name="weapon-wallPenetration" id="weapon-wallPenetration" required>
                        <br>
                        <label>Path</label>
                                <input type="text" name="weapon-path" id="weapon-path" required>
                                <input type="hidden" name="weapon-id" id="map-weapon">
                        <br>
                    </div>
                </div>
                
                <button type="submit" id="button-register" class="button" >REGISTRAR</button>
            </form>
        </div>
    </div>
</body>
</html>