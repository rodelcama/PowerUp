$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {

        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let identificacion = $("#usuario").val();
    let password = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletClienteLogin",
        data: $.param({
            identificacion: identificacion,
            password: password
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let identificacion = parsedResult['identificacion'];
                document.location.href = "home.html?username=" + identificacion;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {

    let identificacion = $("#input-username").val();
    let password = $("#input-contrasena").val();
    let passworConfirmacion = $("#input-contrasena-repeat").val();
    let nombres = $("#input-nombre").val();
    let apellidos = $("#input-apellidos").val();
    let email = $("#input-email").val();
    let nuevo = $("#input-premium").prop("checked");
    let numeroTC = $("#input-saldo").val();


    if (password === passworConfirmacion) {
        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletClienteRegister",
            data: $.param({
                identificacion: identificacion,
                password: password,
                nombres: nombres,
                apellidos: apellidos,
                email: email,
                nuevo: nuevo,
                numeroTC: numeroTC
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let identificacion = parsedResult['identificacion'];
                    document.location.href = "home.html?username=" + identificacion;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}


