<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <form action="WebController" method="post">
        <input type="hidden" name="action" value="register">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username">
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password">
        </div>
        <div>
            <button type="submit">Register</button>
        </div>
    </form>
</body>
</html>
