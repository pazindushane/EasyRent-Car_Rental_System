$('#btn-g-login').on('click', function () {
    $('.login-form').css({display: "none"});
    $('.Signup-form').css({display: "none"});
    $('.header').css({display: "block"});
    $('.button-section').css({display: "block"});
    $('.view-car-table').css({display: "block"});
    $('.unreg').css({display: "none"});
    $('.reg').css({display: "block"});
});

$('#btn-cn-cancel').on('click', function () {
    $('.Signup-form').css({display: "none"});
    $('.view-car-table').css({display: "block"});
    $('.login-form').css({display: "none"});
    $('.header').css({display: "block"});
    $('.button-section').css({display: "block"});
    $('.unreg').css({display: "block"});
    $('.reg').css({display: "none"});
});


$('#btn-g-link').on('click', function () {
    $('.login-form').css({display: "block"});
    $('.Signup-form').css({display: "none"});
    $('.view-car-table').css({display: "none"});
    $('.header').css({display: "none"});
    $('.button-section').css({display: "none"});
});