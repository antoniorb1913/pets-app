<?php

$api_url = getenv('API_URL') ?: 'https://pets-app-nvk5.onrender.com/pet/list';
$data = file_get_contents($api_url);
//Json to Array
$pets = json_decode($data, true);
?>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <title>Listado de mascotas</title>
    </head>
    <body>
        <table class="table table-striped">
                <thead>
                <h1 style="text-align: center;">Listado de mascotas</h1>
                <br>
                    <tr>
                        <td>ID</td>
                        <td>NAME</td>
                        <td>CHIP</td>
                        <td>CATEGORY</td>
                        <td>BORN</td>
                        <td>ADOPT<td>
                    </tr>
                </thead>
                <tbody>
                    <?php foreach($pets as $pet): ?>
                        <tr>
                            <td><?php echo $pet['id'] ?></td>
                            <td><?php echo $pet['name'] ?></td>
                            <td><?php echo $pet['chip'] ?></td>
                            <td><?php echo $pet['category'] ?></td>
                            <td><?php echo $pet['born'] ?></td>
                            <td><?php echo $pet['born'] ?></td>
                            <td><?php if ($pet['adopt'] === FALSE): ?>
                                <form method="post" action="http://localhost:8081/pet/adopt/<?=$pet['id']?>">
                                    <button type="submit">Adoptar</button>
                                <?php else: ?>
                                    <span>Adoptado</span>
                                <?php endif; ?>
                                </form>
                            </td>
                        </tr>
                    <?php endforeach; ?>
        </table> 
                <h2 style="text-align:center;">Añadir Mascota</h2>
        <form method="post" action="http://localhost:8080/pet/add">
            <label class="form-label">Nombre:</label>
            <input type="text" name="name" required>
            <br>
            <label class="form-label">Chip:</label>
            <input type="text" name="chip" required>
            <br>
            <label class="form-label">Categoría:</label>
            <input type="text" name="category" required>
            <br>
            <label class="form-label">Nacimiento:</label>
            <input type="date" name="born" required>
            <br>
            <button type="submit">Añadir Mascota</button>
        </form>
    </body>
</html>