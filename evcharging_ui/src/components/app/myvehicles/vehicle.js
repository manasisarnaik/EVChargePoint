import axios from 'axios';
import React from 'react';
import './myvehicles.css'

class Vehicle extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    deleteVehicle = () =>{
        axios.post("http://localhost:8081/user/deleteVehicle", 
        {
            id: this.props.vehicle.id
        }).then((Response) => {
            console.log(Response.data);
            if(Response.data==true)
                console.log("vehicle deleted");
            else
                console.log("vehicle not deleted");
        })
    }

    render()
    {
        console.log(this.props);
        return(
            <tr>
                {/* <td>{this.props.v.name}</td> */}

                <td>{this.props.vehicle.type}</td>
                <td>{this.props.vehicle.registration_no}</td>
                <td><button type="button" class="btn btn-info">See bookings</button></td>
                <td><button onClick={this.deleteVehicle}type="button" class="btn btn-danger">Delete vehicle</button></td>
            </tr>
        );
    }
}
export default Vehicle;