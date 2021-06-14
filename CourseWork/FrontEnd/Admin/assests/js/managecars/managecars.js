$('#addCar').on('click', function () {
    setSelected($(this));
    $('.add-car').css({display: "block"});
    $('.view-cars').css({display: "none"});
    $('.edit-cars').css({display: "none"});
});
$('#viewCars').on('click', function () {
    setSelected($(this));
    // viewAllCars();
    $('.view-cars').css({display: "block"});
    $('.add-car').css({display: "none"});
    $('.edit-cars').css({display: "none"});

});
$('#editCar').on('click', function () {
    setSelected($(this));
    // viewToEditCars();
    $('.edit-cars').css({display: "block"});
    $('.add-car').css({display: "none"});
    $('.view-cars').css({display: "none"});
});

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