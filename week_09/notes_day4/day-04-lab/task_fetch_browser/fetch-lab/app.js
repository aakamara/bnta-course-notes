let ourHeading = document.getElementById("mainHead");
const countriesSection = document.getElementById("counList")

const countriesURL = "https://restcountries.com/v2/all";

function grabName(countryData) {
    let countryName = countryData[0].name;
    return countryName;
}

function grabData(countryData) {
    let countryName = countryData.name;
    let population = countryData.population;
    let countryInfo = countryName + ", population: " + population;
    return countryInfo;
}

function grabFlag(countryData) {
    let countryFlag = countryData.flag;
    return countryFlag;
}

function mapCountries(countryData) {
    let countries = countryData;
    for (let country of countries) {
        let countryInfo = grabData(country);
        let countryFlag = grabFlag(country);
        let newParagraph = document.createElement("p");
        let flag = document.createElement("img");
        newParagraph.append(countryInfo);
        flag.setAttribute("src", countryFlag);
        flag.setAttribute("class", "flag")
        countriesSection.append(newParagraph);
        countriesSection.append(flag);
    }
}

function fetchAllCountries() {
    fetch(countriesURL)
    .then(response => response.json())
    .then(data => mapCountries(data))
    .then(() => ourHeading.innerHTML = "Countries:")
    .catch(() => console.log("oop"))
}

function fetchSpecificCountry(inputCountry) {
    if (!inputCountry) {
        fetchAllCountries();
        return;
    }
    const countryURL = "https://restcountries.com/v2/name/" + inputCountry;
    fetch(countryURL)
    .then(response => {
        console.log(response)
        if (response.ok) {
            return response.json();
        } else {
            throw response;
        }
    })
    .then(data => mapCountries(data))
    .then(() => ourHeading.innerHTML = "Countries:")
    .catch(() => ourHeading.innerHTML = "Failed to load data (404 Bad Request)")
}


