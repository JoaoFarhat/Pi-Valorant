<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
    <title>Skins</title>
    <link rel="stylesheet" href="CreateSkin.css">
</head>
<body>
    <header>
        <div id="header-up">
            <a href="../home/home.jsp" class="logo-ancora" id=""><img class="" id="logo-navbar" src="images/logo.png" alt="logo"></a>
            <a href="../home/home.jsp" class="logo-ancora" id=""><h2 id="titulo-header">Visão Administrativa</h2></a>
        </div>
        <nav class="nav_links">
            <div class="nav_link">
                <a href="../create-agent/CreateAgent.jsp"><img id="agent-icon" class="icon" src="images/agent-icon.png">Agentes</a>
            </div>
            <div class="nav_link">
                <a href= "/armas" ><img id="weapon-icon" class="icon" src="images/weapon-icon.png">Armas</a>
            </div>
            <div class="nav_link">
                <a href="../create-map/CreateMap.jsp"><img id="map-icon" class="icon" src="images/map-icon.png">Mapas</a>
            </div>
            <div class="nav_link">
                <a href="../create-skin/CreateSkin.jsp"><img id="skin-icon" class="icon" src="images/skin-icon.jpg">Skins</a>
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
            <h2 id="form-title">Agentes</h2>
            <form id="form-create-skin" action="/create-skin" method="post">
                <div id="colunas">
                    <div id="coluna-1">
                        <label>Name</label>
                        <input type="text" name="skin-name" id="skin-name">
                        <br>
                        <label>Season</label>
                            <input type="number" name="skin-season" id="skin-season">
                        <br>
                        <label>Act</label>
                            <input type="number" name="skin-act" id="skin-act">
                        <br>
                        <label>Date</label>
                            <input type="date" name="skin-date" id="skin-date">
                        <br>
                    </div>
                    <div id="coluna-2">
                        <label>Price</label>
                            <input type="number" name="skin-price" id="skin-price">
                        <br>
                        <label>Recolors</label>
                            <input type="number" name="skin-recolors" id="skin-recolors">
                        <br>
                        <label>Path</label>
                            <input type="text" name="skin-path" id="skin-path">
                        <br>
                    </div>
                </div>
                <button type="submit" id="button-register" class="button" >REGISTRAR</button>
            </form>
        </div>
    </div>
</body>
</html>