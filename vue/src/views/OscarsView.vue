<template>
  <div class="oscars">
    <h1>Oscars Night 2023</h1>
    <h2>Make your guesses!</h2>
    <div>
      <div class="category" v-for="category in categories" :key="category.categoryId" :id="category.categoryId">
        <h3>{{ category.name }}</h3>
        <table>
          <tbody>
            <tr>
              <th>Nomination Top</th>
              <th>Nomination Bottom</th>
              <th>Your Selection</th>
              <th>Winner</th>
              <th>Results</th>
            </tr>
            <tr>
              <td>{{ category.nominationOneTop }}</td>
              <td>{{ category.nominationOneBottom }}</td>
              <td>
                <select name="user-selection" v-on:change="updateUserSelection(category)">
                  <option value=""> --- </option>
                  <option value="1">{{ category.nominationOneTop }}</option>
                  <option value="2">{{ category.nominationTwoTop }}</option>
                  <option value="3">{{ category.nominationThreeTop }}</option>
                  <option value="4">{{ category.nominationFourTop }}</option>
                  <option value="5">{{ category.nominationFiveTop }}</option>
                </select>
              </td>
              <td>
                <select name="winner-selection" v-on:change="updateWinner(category)">
                  <option value=""> --- </option>
                  <option value="1">{{ category.nominationOneTop }}</option>
                  <option value="2">{{ category.nominationTwoTop }}</option>
                  <option value="3">{{ category.nominationThreeTop }}</option>
                  <option value="4">{{ category.nominationFourTop }}</option>
                  <option value="5">{{ category.nominationFiveTop }}</option>
                </select>
              </td>
              <td>{{ category.userResults }}</td>
            </tr>
            <tr>
              <td>{{ category.nominationTwoTop }}</td>
              <td>{{ category.nominationTwoBottom }}</td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <td>{{ category.nominationThreeTop }}</td>
              <td>{{ category.nominationThreeBottom }}</td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <td>{{ category.nominationFourTop }}</td>
              <td>{{ category.nominationFourBottom }}</td>
              <td></td>
              <td></td>
            </tr>
            <tr>
              <td>{{ category.nominationFiveTop }}</td>
              <td>{{ category.nominationFiveBottom }}</td>
              <td></td>
              <td></td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>


<script>
import CategoryService from '@/services/CategoryService';

export default {
  data() {
    return {
      categories: [],
      
    }
  },
  computed:{
   
  },
  methods: {
    updateUserSelection(categoryToUpdate){
      let currentCategoryBox = document.getElementById(categoryToUpdate.categoryId);
      let currentUserDropdown = currentCategoryBox.querySelector('[name=user-selection]')
      let currentUserDropdownValue = currentUserDropdown.value;

      categoryToUpdate.userSelection = currentUserDropdownValue;
    },
    updateWinner(categoryToUpdate){
      let currentCategoryBox = document.getElementById(categoryToUpdate.categoryId);
      let currentUserDropdown = currentCategoryBox.querySelector('[name=winner-selection]')
      let currentUserDropdownValue = currentUserDropdown.value;
      
      categoryToUpdate.winner = currentUserDropdownValue;

      //currently the happy paths work, however, there are edge cases to deal with. for example, if a user make their selection then fills in the winner, THEN changes their seleciton, it won't be correct
      if(categoryToUpdate.userSelection === ""){
        categoryToUpdate.userResults = "Please make your selection" 
      } else if(categoryToUpdate.userSelection === categoryToUpdate.winner) {
        categoryToUpdate.userResults = "Correct!"
      } else {
        categoryToUpdate.userResults = "Incorrect :("
      }
    }
  },
  mounted() {
    CategoryService.getAllCategories()
      .then(response => {
        console.log(response);
        this.categories = response.data;
      })
      .catch(error => {
        console.log(error);
      });
  }
}
</script>

<style scoped>
.oscars {
  background-color: goldenrod;
  height: 100%;
  overflow:auto;
}

.category {
  border: 1px solid blue;
  
}
</style>


