function sendForm() {
    const citizen={
        firstName:$("#firstName").val(),
        surname:$("#surname").val(),
        DoB:$("#doB").val(),
        SSN:$("#SSN").val(),
        phoneNr:$("#number").val(),
        email:$("#mail").val(),
        city:$("#city").val(),
        street:$("#street").val()
    }
    console.log(citizen)
    if (validerFirstName() && validerSurname() && validerdoB() && validerSSN() && validerNummer()
        && validerEpost() && validerCity() && validerStreet()){
        $.post("/saveCitizen", citizen, function () {

        })
            .fail(function (jqXHR) {
                const json=$.parseJSON(jqXHR.responseText);
                $("#feil").html(json.message);
            })
    }
}