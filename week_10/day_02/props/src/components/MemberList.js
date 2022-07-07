import Member from "./Member";

const MemberList = ({members}) => {

    const memberComponents = members.map((member, index) => {
        return <Member key={index} member={member} />
    })

    return(
        <>
            {memberComponents}
        </>
    );
}

export default MemberList;