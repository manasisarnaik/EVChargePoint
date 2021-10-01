import React from 'react';
import Brands from './brands';
import Slot from './slot';
import axios from 'axios';

class Profile extends React.Component
{
    constructor(props)
    {
        super(props);
        
    }

    

    render()
    {
        
        return( 
            <div>
                <div className="header">
                    <h1>PROFILE</h1>
                </div><br/><hr/>
                <Brands id={this.props.id}/>
                <Slot id={this.props.id}/>
                {/* <Slot id={this.props.id}/> */}
            </div>
        );
    }
}
export default Profile;