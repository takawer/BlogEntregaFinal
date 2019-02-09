

<%@ page import="java.util.ArrayList" %>
<%@page import="modelo.Usuario" %>
<%@page import="modelo.Papel" %>
<%@page import="modelo.EnumPapeis" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    boolean eadmin = false;
    Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");

    if(usuario != null) {
        ArrayList<Papel> papeis = (ArrayList<Papel>) usuario.getPapeis();
        for (Papel papel : papeis) {
            if (papel.getDescricao().toString().equals("Administrador")) {
                eadmin = true;
            }
        }
    }
%>
<html>


<header>

    <%if (usuario == null) {%>
    <nav class="nav">
            <a style="float: left"href="paginainicial">HOME</a>
            <a style="float: right" href="login">LOGIN</a>
            <a style="float: right"href="cadastrar">CADASTRAR-SE</a>
            <b>VISITANTE</b>
    </nav>
    <%} else if(eadmin){%>
    <nav class="nav">
            <a style="float: left"href="paginainicial">HOME</a>
            <a style="float: left"href="escrever">POSTAR</a>
            <a style="float: left"href="gerenciar">USUÁRIOS</a>
            <a style="float: right"href="sair">SAIR  </a>
            <b><%= usuario.getNome().toUpperCase()%></b>
        <%} else {%>
        <nav class="nav">
                <a style="float: left"href="paginainicial">HOME</a>
                <a style="float: right"href="sair">SAIR</a>
                <b>BEM VINDO, <%= usuario.getNome().toUpperCase()%></b>
            <%}%>
    </nav>


        <style>
            @font-face {
                font-family: OstrichBold;
                src: url("../fonts/ostrich-sans-bold.ttf");
            }

            body{
                padding: 0;
                margin: 0;
            }

            a{
                color: white;
                margin: 0 50px 50px 0;
            }

            /* NavBar */
            .nav {
                background-color: black;
                overflow: hidden;
                top: 0;
                width: 100%;
                height: 3em;
            }
            .nav {
                margin-top: -3px; }

            .nav a {
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-size: 17px;
            }


            .nav a:hover {
                background-color: darkgoldenrod;
                color: black;
            }
            .nav b {
                float: right;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-size: 17px;
            }


            .nav b:hover {
                background-color: darkgoldenrod;
                color: black;
            }



        </style>

</header>

<body>

</body>
</html>
