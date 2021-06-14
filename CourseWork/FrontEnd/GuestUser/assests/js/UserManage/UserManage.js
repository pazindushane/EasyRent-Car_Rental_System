$('#login').on('click', function () {
    $('.login-form').css({display: "block"});
    $('.view-car-table').css({display: "none"});
    $('.Signup-form').css({display: "none"});
    $('.header').css({display: "none"});
    $('.button-section').css({display: "none"});
});

$('#signup').on('click', function () {
    $('.Signup-form').css({display: "block"});
    $('.view-car-table').css({display: "none"});
    $('.login-form').css({display: "none"});
    $('.header').css({display: "none"});
    $('.button-section').css({display: "none"});
});

$('#profile').on('click', function () {
    $('.Signup-form').css({display: "block"});
    $('.upro').css({display: "block"});
    $('.User-P').css({display: "block"});
    $('.view-car-table-1').css({display: "none"});
    $('.Rent-request').css({display: "none"});
    $('.Request-status').css({display: "none"});
    $('.btn-g-link').css({display: "none"});
    $('.btn-g-login').css({display: "none"});
});


