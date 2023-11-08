<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        .flex {
            display: flex;
            margin-bottom: 15px;
        }
        .flex label {
            width: 80px;
        }
        .input-d {
            width: 200px;
        }
        .btn {

        }
    </style>

    <title>JSP - Hello World</title>
</head>
<body>
<h1>Máy tính đơn giản</h1>

<div>
    <form action="calculator" method="POST">
        <fieldset>
            <legend>Máy Tính</legend>

            <div class="flex">
                <label>Số đầu:</label>
                <input type="text" name="first" class="input-d">
            </div>

            <div class="flex">
                <label>Toán tử:</label>
                <select name="operator" class="input-d">
                    <option value="cong">Cộng</option>
                    <option value="tru">Trừ</option>
                    <option value="nhan">Nhân</option>
                    <option value="chia">Chia</option>
                </select>
            </div>

            <div class="flex">
                <label>Số thứ 2:</label>
                <input type="text" name="second" class="input-d">
            </div>

            <div class="btn">
                <button type="submit">Tính</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>