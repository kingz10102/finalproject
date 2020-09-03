import React, { Component } from 'react';
import NavBar from '../icons/linebar-menu.svg';
import Logo from "../icons/sneakerking-logo.png"
import CartIcon from'../icons/cart-plus-solid.svg';
import Exit from '../icons/times-circle-regular.svg';
import {Link} from 'react-router-dom'



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
             <nav>
                 <ul>
                  <li><Link to="/">Home</Link></li>
                  <li><Link to="/sneakers">Sneakers</Link></li>
                  <li><Link to="/contact">Contact</Link></li>
                  <li><Link to="/about">About</Link></li>
                  <li><Link to="/login">Login / Register Now</Link></li>
                  <li className="exit">
                        <img src={Exit} alt="exit icon" width="18"/>
                    </li>
                    </ul>
                    <div className="nav-cart">
                       <Link to="/cart-page">
                        <img src={CartIcon} alt="cart icon" width="20"/>
                        </Link>
                    </div>
                    </nav>
               </header>

        )
    }
}

export default Header