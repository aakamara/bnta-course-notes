const FruitList = () => {

const fruits = ["apple", "orange", "pear"];
const fruitsList = fruits.map((fruit, index) => (
    <li key = {index}>{fruit}</li>
));

    return(
        <>
        <h1>List of Fruits</h1>
        <ul>{fruitsList}</ul>
        </>
    )
}

export default FruitList;