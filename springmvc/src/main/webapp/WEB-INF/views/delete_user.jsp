<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete User</title>
    <style>
       body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            text-align: center;
            padding: 50px;
        }
.form-container {
            margin: auto;
            padding: 20px;
            background: #fff;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 50%;
        }

/* Header Styles */
h2 {
    margin-bottom: 20px;
    color: #004d99;
    font-size: 1.8em;
}

/* Form Styles */
form {
    display: flex;
    flex-direction: column;
    gap: 15px;
}

label {
    font-size: 1.5em;
    font-weight: bold;
    text-align: left;
    color: #555;
}

 input, button {
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-size: 1em;
        }

button {
    padding: 10px;
    border: none;
    border-radius: 5px;
    background-color: #004d99;
    color: #fff;
    font-size: 1.1em;
    cursor: pointer;
    transition: background-color 0.3s;
}

button:hover {
    background-color: #003366;
}

/* Responsive Design */
@media (max-width: 480px) {
    .container {
        width: 90%;
    }

    h2 {
        font-size: 1.5em;
    }

    button {
        font-size: 1em;
    }
}
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Delete User</h2>
        <form action="./delete-user" method="post">
            <label for="userId">User ID:</label>
            <input type="number" id="userId" name="userId" placeholder="Enter User ID" required>
            <button type="submit">Delete</button>
        </form>
        <p>${message}</p>
    </div>
</body>
</html>
