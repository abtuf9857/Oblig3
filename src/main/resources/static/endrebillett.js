function visbillett(billetter) {
    let ut = ""
    for (let film in billetter) {
        console.log(billetter[film])
        let filmer_ut = "<tr>" + "<td>" + billetter[film].film + "</td>" + "<br/>" + "<td>" + billetter[film].antall + "</td>" + "<br/>" + "<td> " + billetter[film].fornavn + "<br/>" + "<td/>" + billetter[film].etternavn +
            "<br/>" + "<td>" + billetter[film].telefonnr + "<br/>" + "</td>" + "<td>" + billetter[film].epost + "</td>" + "<button>Endre billett</button>"
        ut += filmer_ut
    }
    document.getElementById("visbillett").innerHTML = ut
}
function hentAlle(){
    $.get("/hentAlle", function (data) {
        visbillett(data)

    });
}