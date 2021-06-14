
function switchToCars() {
    $('.main-container>section').css({display: "none"});
    $('.cars-container').css({display: "block"});
}

function switchToDashboard() {
   $('.main-container>section').css({display: "none"});
   $('.dashboard-container').css({display: "block"});
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

function switchToRental() {
    // calculateIncome();
    $('.main-container>section').css({display: "none"});
    $('.rental-container').css({display: "block"});
}
