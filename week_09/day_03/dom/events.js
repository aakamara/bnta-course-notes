const state = {
    count: 0
}

const handleClick = (event)=>{
    const btn = document.querySelector('#test-button');
    // console.log(btn.style);
    btn.style.backgroundColor = 'pink';
    btn.style.color = "white";
    if(state.count >= 20){
        btn.innerText = "Easy tiger!";
        return;
    }
    state.count++;
    btn.innerText = `Clicked me ${state.count} times`;
}

const handleMouseOut = event => btn.style.border= '';

document.getElementById('test-button').addEventListener('click',
    (event)=>{
        console.log(event);
        // console.error('something is wrong');
        try{
            if(1){
                throw Error('a custom error');
            }
        }
        catch(error){
            console.error(error);
        }
    }
);

document.querySelector('#test-button').addEventListener('click', handleClick);

document.querySelector('#test-button').addEventListener('mouseover', event => btn.style.border
= '1px dotted red');

btn.addEventListener('mouseout',handleMouseOut);