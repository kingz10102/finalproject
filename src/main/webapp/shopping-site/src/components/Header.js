import React, { Component } from 'react';
import NavBar from '../icons/linebar-menu.svg';
import Logo from "../icons/sneakerking-logo.png"
//import CartIcon from'./images/cart-plus-solid.svg';



class Header extends Component {
    render() {
        return (
           <header>
            <div className="nav-bar">
                <img src={NavBar} alt="" width="23"/>
            </div>
            <div className="logo-title">
            <img src={Logo} alt="sneaker king title" width="180"/>
            </div>
            </header>
        )
    }
}

export default Header