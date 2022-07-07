const Member = ({member}) => {
    return(
        <div className="person-card">
            <h3>{member.name}</h3>
            <p>{member.email}</p>
            <p>{member.employeeNumber}</p>
            <hr />
        </div>
    );
}

export default Member;