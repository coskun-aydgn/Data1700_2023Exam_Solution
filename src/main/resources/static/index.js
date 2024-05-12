function validerUsername(){
    const username = $("#userName").val();
    const regexp = /^[a-zA-ZæøåÆØÅ. \-]{2,20}$/;
    const ok = regexp.test(username);
    if(!ok){
        $("#feilUsername").html("Navnet må bestå av 2 til 20 bokstaver");
        console.log("feil username")
        return false;
    }
    else{
        $("#feilUsername").html("");
        console.log(" username ok")
    return true;}
}

function validerPassword(){
    const password = $("#password").val();
    const regexp = /^(?=.*[A-ZÆØÅa-zøæå])(?=.*\d)[A-ZØÆÅa-zøæå\d]{8,}$/;
    const ok = regexp.test(password);
    if(!ok){
        $("#feilPassword").html("Passordet må være minimum 8 tegn, minst en bokstav og et tall");
        console.log("feil password")
        return false;
    }
    else{
        $("#feilPassword").html("");
        console.log(" password ok")
        return true;}
}
function loggInnValideringOK() {
    return (validerUsername() && validerPassword());
}
function index() {
    if(loggInnValideringOK()){

        const url = "/loginn?username="+$("#userName").val()+"&password="+$("#password").val();
        $.get( url, function( OK ) {
            console.log(OK)
            if(OK){
                window.location.href="registrer.html";
            }
            else{
                $("#feil").html("Feil i brukernavn eller passord");
            }
        })
            .fail(function(jqXHR) {
                const json = $.parseJSON(jqXHR.responseText);
                $("#feil").html(json.message);
            });
    }
}