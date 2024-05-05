function validerFirstName() {
    const firstName = $("#firstName").val();
    const regexp = /^[a-zA-ZæøåÆØÅ. \-]{2,20}$/;
    const ok = regexp.test(firstName);
    if(!ok){
        $("#feilFirstName").html("First name must consist of 2 to 40 letters and numbers");
        return false;
    }
    else{
        $("#feilFirstName").html("");
        return true;
    }
}
function validerSurname() {
    const surname = $("#surname").val();
    const regexp = /^[a-zA-ZæøåÆØÅ. \-]{2,20}$/;
    const ok = regexp.test(surname);
    if(!ok){
        $("#feilSurname").html("Surname must consist of 2 to 40 letters and numbers");
        return false;
    }
    else{
        $("#feilSurname").html("");
        return true;
    }
}
function validerdoB() {
    const doB = $("#doB").val();
    const regexp = /^(1[0-2]|0?[1-9])(\/|-)(3[01]|[12][0-9]|0?[1-9])\2([0-9]{2})?[0-9]{2}$/;
    const ok = regexp.test(doB);
    if(!ok){
        $("#feilDoB").html("The date of birt format should be mm/dd/yyyy.");
        return false;
    }
    else{
        $("#feilDoB").html("");
        return true;
    }
}
function validerSSN() {
    const ssn = $("#SSN").val();
    const regexp = /^[0-9]{11}$/;
    const ok = regexp.test(ssn);
    if(!ok){
        $("#feilSSN").html("The social security number must consist of 11 digits");
        return false;
    }
    else{
        $("#feilSSN").html("");
        return true;
    }
}
function validerNummer() {
    const number = $("#number").val();
    const regexp = /^[0-9]{8}$/;
    const ok = regexp.test(number);
    if(!ok){
        $("#feilNumber").html("Phone number number must consist of 8 digits");
        return false;
    }
    else{
        $("#feilNumber").html("");
        return true;
    }
}
function validerEpost() {
    const email = $("#mail").val();
    const regexp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const ok = regexp.test(email);
    if(!ok){
        $("#feilEmail").html("Enter the email address in the correct format (e.g. ca@ca.ca)");
        return false;
    }
    else{
        $("#feilEmail").html("");
        return true;
    }
}
function validerCity() {
    const city = $("#city").val();
    const regexp = /^[0-9a-zA-ZæøåÆØÅ. \-]{2,30}$/;
    const ok = regexp.test(city);
    if(!ok){
        $("#feilCity").html("The city must consist of 2 to 40 letters and numbers");
        return false;
    }
    else{
        $("#feilCity").html("");
        return true;}

}
function validerStreet() {
    const street = $("#street").val();
    const regexp = /^[0-9a-zA-ZæøåÆØÅ. \-]{2,30}$/;
    const ok = regexp.test(street);
    if(!ok){
        $("#feilStreet").html("The street must consist of 2 to 40 letters and numbers");
        return false;
    }
    else{
        $("#feilStreet").html("");
        return true;
    }

}
