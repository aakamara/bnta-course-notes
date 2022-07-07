import Chocolate from './Chocolate';

const ChocolateList = ({chocolates, deleteChocolate}) => {

    const chocolateComponents = chocolates.map(chocolates => {
        return<Chocolate 
                    key={chocolates.id}
                    chocolate={chocolates}
                    deleteChocolate={deleteChocolate}/> 
                        // rendering the chocolate components
    })

    return(
        <>
        <h3>List of Chocolates</h3>
        <hr />
        {chocolateComponents}
        </>
    )

}

export default ChocolateList;