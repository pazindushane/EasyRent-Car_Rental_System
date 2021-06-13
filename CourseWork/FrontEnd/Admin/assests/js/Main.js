// function switchToDashboard() {
//     $(document).ready(function() {
//     $("#btndash").click(function() {

//     });
//     });
// }

function switchToCars() {
    $('.main-container>section').css({display: "none"});
    $('.cars-container').css({display: "block"});
}

function switchToDashboard() {
                $('.main-container>section').css({display: "none"});
                $('.dashboard-container').css({display: "block"});
}

function switchToManageCars() {
    /*
    $('#addCar').parent().children().css({
        backgroundColor: "white",
        color: "#24c0cd"
    });
    $('#addCar').css({
        backgroundColor: "#24c0cd",
        color: "white"
    });
     */
    $('#addCar').click();
    $('.main-container>section').css({display: "none"});
    $('.manage-cars-container').css({display: "block"});

}

function switchToCustomer() {
    // loadAllCustomers();
    $('.main-container>section').css({display: "none"});
    $('.view-customers-container').css({display: "block"});
}

function switchToIncome() {
    // calculateIncome();
    $('.main-container>section').css({display: "none"});
    $('.calculate-income-container').css({display: "block"});
}
