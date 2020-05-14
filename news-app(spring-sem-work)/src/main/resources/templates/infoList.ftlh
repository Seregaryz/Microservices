<head>
    <meta charset="UTF-8">
    <title>info</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <#import "spring.ftl" as spring />
</head>
<body>
<div class="container container-post">
    <div class="row">
        <div class="col">
            <h2 class="my-4"><@spring.message 'base.element.info'/></h2>
            <h2 class="mb-4">${count}</h2>
        </div>
    </div>
</div>
</body>