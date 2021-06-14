$('#btn-login').on('click', function () {
    $('.header').css({display: "block"});
    $('.button-section').css({display: "block"});
    $('.view-car-table').css({display: "block"});
    $('.login-form').css({display: "none"});
    $('.Signup-form').css({display: "none"});
    $('.unreg').css({display: "none"});
    $('.reg').css({display: "block"});
});

$('#btn-signup').on('click', function () {
    $('.Signup-form').css({display: "block"});
    $('.view-car-table').css({display: "none"});
    $('.login-form').css({display: "none"});
    $('.header').css({display: "none"});
    $('.button-section').css({display: "none"});
    $('.unreg').css({display: "none"});
    $('.reg').css({display: "block"});
});

$('#btn-cancel').on('click', function () {
    $('.view-car-table').css({display: "block"});
    $('.header').css({display: "block"});
    $('.button-section').css({display: "block"});
    $('.Signup-form').css({display: "none"});
    $('.login-form').css({display: "none"});
    $('.unreg').css({display: "block"});
    $('.reg').css({display: "none"});
});
