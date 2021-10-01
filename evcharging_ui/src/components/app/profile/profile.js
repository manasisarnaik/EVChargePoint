import React from 'react';
import DetailBox from './detail_box';
import Axios from 'axios';
import './profile.css'

class Profile extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            json_string: ""
        }
        // this.getUserData();
    }

    // getUserData = () =>
    // {
    //     Axios.post("http://localhost:8081/user/getProfile", 
    //     {
    //         id: this.props.id
    //     }).then((Response) => {
    //         this.setState({json_string: JSON.stringify(Response.data)});
    //     });
    // }

    render()
    {  
         console.log(this.props.u);
        var dis = [];
        for (const iterator of this.props.u.vehicles) {
            dis.push(
            
                    <div>
                             <div className="card">
                                <p>Vehicle Type: {iterator.type}</p>
                                <p>Vehicle Registration no: {iterator.registration_no}</p>
                            </div>
                    </div>
                    )
        }
        return(
            <div>
                 <div className="bgimg">
                {this.state.json_string}
                <div class="container-fluid">
                    <h2>
                        USER PORTAL
                    </h2>
                    <div className="row bg-dark">
                    <div className="col-sm-2"><br/>
                        <img className="img-thumbnail width=50px" src="gtr.jpg"></img><br/><br/> 
                    </div>
                </div> <br/>
                    <div className="col-sm-4">
                    <table class="table table-hover">
                        <p><b>Name :</b> {this.props.u.name.first_name +" "+this.props.u.name.last_name}</p>
                        <p><b>Email :</b> {this.props.u.email_id}</p>
                        <p><b>Mobile no :</b> {this.props.u.mobile_no}</p>
                        <p><b>Password :</b> {this.props.u.password}</p><hr/>
                    </table>
                        <div class="dropdown dropright">
                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                            <b>Vehicles</b>
                            </button>
                            <div class="dropdown-menu">
                            {dis.map((value) => {return value})}
                            </div><br/><br/><br/><br/><br/><br/>
                        </div>
                    </div>
               
                </div>
            </div>
        </div>    
        );
    }
}
export default Profile;