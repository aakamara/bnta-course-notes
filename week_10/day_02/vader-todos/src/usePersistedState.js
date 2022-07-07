import { useState, useEffect } from "react";
// custom hooks should begin with 'use';
const usePersistedState = (key, initialValue) => {
    // initialise useState, return getters and setter -- done
    // retain pointers to same getters and setters HERE -- done
    // use useEffect to update localStorage whenever the state changes
    const [value, setValue] = useState(initialValue);

useEffect(()=> {
    localStorage.setItem(key, JSON.stringify(value));
}, [value]);

    return[value, setValue];
}

export default usePersistedState;