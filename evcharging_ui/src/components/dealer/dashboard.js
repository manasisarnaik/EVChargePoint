import axios from 'axios';
import React from 'react';

class Dashboard extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={b:[], status: "null"};
        this.getBookings();
    }

    getBookings = () =>{
        axios.post("http://localhost:8081/dealercont/getDealerBookings", 
        {
            id: this.props.id
        }).then((Response) => {
            console.log(Response.data);
            this.setState({b:Response.data}, () =>{
                this.setState({status: "done"});
            });
        })
    }

    render()
    {
        if(this.state.status == "done")
        {

            var bookings = [];
            for (const iterator of this.state.b) {
                bookings.push(<tr>
                    <td>{iterator.vehicle_registration_no}</td>
                    <td>{iterator.start_time}</td>
                    <td>{iterator.end_time}</td>
                    <td>{iterator.package_.price + " "+ iterator.package_.price_unit + "/ "
                    + iterator.package_.charge_unit_count + " " + iterator.package_.charge_unit_unit + 
                    " or " + iterator.package_.time_unit_time + " " + iterator.package_.time_unit_unit}</td>
                </tr>);
            }
            return <div>
             
                <div class="container-fluid">
                        <h2>
                            Dashboard
                        </h2>
                <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Vehicle Registration</th>
                                    <th>Time In</th>
                                    <th>Time Out</th>
                                    <th>Package</th>
                                </tr>
                            </thead>
                            <tbody>
                                {bookings.map((value)=>{return value})}
                            </tbody>
                        </table>
                </div>
            </div>;
        }
        return <div></div>;
       
    }
}
export default Dashboard;