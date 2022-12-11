import Big from 'big.js';

export interface Product {
    id: number;
    category: string;
    inventory: number;
    brand: string;
    model: string;
    name: string;
    price: Big;
}
