import axios from 'axios';
import { GLOBAL_URL } from './util.js';

const URL = `${GLOBAL_URL}/user`;

export const getUsers = async () => {
  try {
    const res = await axios.get(`${URL}/select`);
    return res;
  } catch (e) {
    console.log(e);
    return e;
  }
};

export const saveUsers = async (item) => {
  try {
    const res = await axios.put(`${URL}/update`, item);
    return res;
  } catch (e) {
    console.log(e);
  }
};

export const deleteUsers = async (idx) => {
  try{
    const res = await axios.delete(`${URL}/delete/${idx}`);
    return res;
  }catch(e){
    console.log(e);
    return e;
  }
};
