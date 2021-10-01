import React from 'react';
import './myvehicles.css'
import Vehicle from './vehicle';

class MyVehicles extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        console.log(this.props);
        var dis =[];
        for (const iterator of this.props.u.vehicles) {
            dis.push(<Vehicle vehicle={iterator}/>)            
        }
        return(
            <div>
                <div className="bgimg">
                <div class="container-fluid">
                    <h2>
                        My Vehicles
                    </h2><hr/><br/><br/>
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>Type</th>
                            <th>EV registration no.</th>
                            <th>Bookings</th>
                            <th>Delete vehicle</th>
                        </tr> 
                        </thead>
                        <tbody>
                            {dis.map((value) =>{return value})}
                        </tbody>
                    </table>
                    </div>
                </div>     
            </div>
        );
    }
}
export default MyVehicles;