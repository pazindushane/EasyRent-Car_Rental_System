// $('#requestss').on('click', function () {
//     setSelected(ref);
//     $('.view-rentals').css({display: "block"});
//     $('.change-driver').css({display: "none"});
//     $('.calculate-payment').css({display: "none"});
// });

function viewRentals(ref) {
    setSelected(ref);
    viewRentalRequests();
    $('.view-rentals').css('display', 'block');
    $('.change-driver').css('display', 'none');
    $('.calculate-payment').css('display', 'none');
    $('#tblCarsForPayment').empty();
    $('#txtAdditionalPayment').val(null);
}

function viewRequestsForPayment(ref) {
    setSelected(ref);
    // loadRequestsToCalculatePayment();
    $('.calculate-payment').css('display', 'block');
    $('.view-rentals').css('display', 'none');
    $('.change-driver').css('display', 'none');

    $('.calculate-payment>div:nth-child(2)').css('display','none');
    $('.calculate-payment>div:nth-child(3)').css('display','none');
    $('#btnFinalizePayment').css('display','none');
}

$('#c-driver').on('click', function () {
    setSelected($(this));
    // viewAllCars();
    $('.change-driver').css({display: "block"});
    $('.view-rentals').css({display: "none"});
    $('.calculate-payment').css({display: "none"});

});
// $('#payments').on('click', function () {
//     setSelected($(this));
//     // viewToEditCars();
//     $('.calculate-payment').css({display: "block"});
//     $('.change-driver').css({display: "none"});
//     $('.view-rentals').css({display: "none"});
// });

function setSelected(ref) {

    ref.parent().children().css({
        backgroundColor: "white",
        color: "#24c0cd"
    });
    ref.css({
        backgroundColor: "#24c0cd",
        color: "white"
    });
}