import MemberList from "../components/MemberList";
import NewMember from "../components/NewMember";
import { useState } from "react";
import UpdateStatus from "../components/UpdateStatus";

const MemberContainer = () => {
    
    const [members, setMembers] = useState([
		{
			name: "Colin",
			email: "colin@brightnetwork.co.uk",
			employeeNumber: 123
		},
		{
			name: "Anna",
			email: "anna@brightnetwork.co.uk",
			employeeNumber: 234
		},
		{
			name: "Phil",
			email: "phil@brightnetwork.co.uk",
			employeeNumber: 345
		},
		{
			name: "Valeria",
			email: "valeria@brightnetwork.co.uk",
			employeeNumber: 456
		}
	]);

	const addNewMember = () => {
		console.log("new member added!");
		const newMember ={
			name:"Joe", 
			email:"joe@brightnetwork.co.uk", 
			employeeNumber:567
		}
		const updatedMembers = [...members, newMember];
		if(applicationsOpen){
			setMembers(updatedMembers)
		}
	}
// creating a hook function to update the status of the application
// use state is the hook that returns two things to us: the variable and the represents the value of the state and the function 
	const [applicationsOpen, setApplicationsOpen] = useState(true);

	const updateApplicationsOpen = () => {
		setApplicationsOpen(!applicationsOpen);
	}

    return (
		<>
			<h1>People Directory</h1>
			<NewMember handleButtonClick={addNewMember} />
			<UpdateStatus 
				applicationsOpen={applicationsOpen} 
				handleClick={updateApplicationsOpen}/>
			<MemberList members = {members}/>
		</>
	);
}

export default MemberContainer;