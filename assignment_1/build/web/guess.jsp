<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cz.upol.pja.lecture01.GuessNumber" %>

<%
    if (request.getParameter("g") == null) {
       session.setAttribute("game", new GuessNumber());
       
       pageContext.setAttribute("newGame", true);
        
       Integer cnt = (Integer) application.getAttribute("GameCount");
       if (cnt == null) cnt = 0;
       application.setAttribute("GameCount", cnt + 1);
       
    } else {
       pageContext.setAttribute("newGame", false);
       try {
            int value = Integer.parseInt(request.getParameter("g"));
            
            GuessNumber guessNumber = (GuessNumber) session.getAttribute("game");
            
            int result = guessNumber.guess(value);
            
            pageContext.setAttribute("result", result);
        } catch (Exception e) {
        }
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Guess the Number</title>
    </head>
    <body>
        <h1>Guess the Number</h1>

        <c:if test="${!pageScope.newGame and pageScope.result lt 0}">
            Too small!
        </c:if> 

        <c:if test="${!pageScope.newGame and pageScope.result gt 0}">
            Too large!
        </c:if> 

        <c:choose>
            <c:when test="${sessionScope.game.status eq 'WON'}">
                <h1>Congratulations, you found it!</h1>
            </c:when>

            <c:when test="${sessionScope.game.status eq 'GAME_OVER'}">
                <h1>Game over, you failed!</h1>
            </c:when>

            <c:otherwise>
                <form method="GET">
                    <input type="number" name="g" min="0" max="1000" />
                    <input type="submit" value="try" />
                </form>
            </c:otherwise>
        </c:choose>

        <c:if test="${!pageScope.newGame}" >
            <h2>History</h2>
            <img src="${pageContext.request.contextPath}/system?type=tree" alt="Cartesian System" /><br />
            <p>The y-axis indicates the selected value.</p>
            <p>The x-axis indicates how many numbers were selected.</p>
            <p>pattern → x. = y</p>
            <c:forEach var="item" items="${sessionScope.game.history}" varStatus="status">
                <c:out value="${status.index + 1}. = ${item}," />&nbsp;
            </c:forEach>
        </c:if>

        <hr />
        Games played so far: <c:out value="${applicationScope.GameCount} "/>
    </body>
</html>