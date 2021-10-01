import React from 'react';
import './book.css'

class Book extends React.Component
{
    constructor(props)
    {
        super(props);
    }
   
    
    render()
    {
        var dis = [];
        // console.log(this.props.view.slots);
        for (const iterator of this.props.view.slots) {
            // console.log(iterator);
            for (const iterator1 of iterator.packages) {
                dis.push(<p>{iterator.type} - {iterator1.price + " " + 
                iterator1.price_unit + " per " + iterator1.charge_unit_count + " " + 
                iterator1.charge_unit_unit + " or " + iterator1.time_unit_time + " " + 
                iterator1.time_unit_unit} <button class="btn btn-success">Book</button></p>);
            }
            
        }
        // console.log(this.props);
        return(
            <div>
                <div class="header">
                    <h1>Slot Booking Portal</h1><hr/>
                </div>
                    <div className="head">
                        <h3>Book your slot here</h3>
                    </div>
                    <div className="card">   
                    <div class="container-fluid p-2 my-3 bg-dark text-white">
                        <h1>{this.props.view.name}</h1>
                    </div>    
                        <h3 className="bg-secondary text-white">{this.props.view.chargetype}</h3>
                        <b>{dis.map((value) =>{return value})}</b>
                    </div>                
            </div>
        );
        }
    }
export default Book;    