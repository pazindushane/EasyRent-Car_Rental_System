
var viewcartable = document.getElementById("view-car-table");
var header = document.getElementById("header");
var buttonsection = document.getElementById("button-section");
var loginform = document.getElementById("login-form");
var Signupform = document.getElementById("Signup-form");
var reg = document.getElementById("reg");

viewcartable.style.display='block';
header.style.display='block';
buttonsection.style.display='block';
loginform.style.display='none';
Signupform.style.display='none';
reg.style.display='none';



function registerUser() {

    let nic = $('#txt-g-NIC').val();
    let email = $('#txtEmail').val();
    let password = $('#password-G').val();
    // let filename = $('#nicImg')[0].files[0].name;
    let address = $('#txtAddress').val();
    let contact = $('#txtContact').val();
    let formData = new FormData();
    for (let file of document.getElementById('nicImg').files) {
        formData.append("file", file)
    }

    formData.append("nic", nic);
    $.ajax({
        method: "POST",
        contentType: false,
        processData: false,
        url: "http://localhost:8080/EasyRent_war_exploded/api/v1/user/uploadimage",
        async: true,
        data: formData,
        success: function (resp) {
            console.log(resp.data);

            if (resp.code == 200) {
                $.ajax({
                    method: "POST",
                    contentType: "application.json",
                    url: "http://localhost:8080/EasyRent_war_exploded/api/v1/user/registerUser",
                    data: JSON.stringify({
                        "nic": nic,
                        "email": email,
                        "password": password,
                        "idPhoto": resp.data,
                        "address": address,
                        "contact": contact
                    })
                });
            } else {
                alert("PLease Upload a NIC")
            }
        }
    });

}

$('#btn-g-login').on('click', function () {
    registerUser();
    $('.login-form').css({display: "none"});
    $('.Signup-form').css({display: "none"});
    $('.header').css({display: "block"});
    $('.button-section').css({display: "block"});
    $('.view-car-table').css({display: "block"});
    $('.unreg').css({display: "none"});
    $('.reg').css({display: "block"});

});



