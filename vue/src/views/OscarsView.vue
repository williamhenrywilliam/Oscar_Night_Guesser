<template>
  <div class="oscars">
    <h1>Oscars Night 2023</h1>
    <h2>Make your guesses! Correct Guesses: {{ correctGuesses }}</h2>
    <div id="bestPictureContainer">
      <h2>Best Picture</h2>
      <table class="tables">
        <tbody>
          <tr>
            <th class="table-header-one">Nomination</th>
            <th class="table-header-three">Your Selection</th>
            <th class="table-header-four">Winner</th>
            <th class="table-header-five">Results</th>
          </tr>
          <tr>
            <td>{{ bestPicture[0].nominationOneTop }}</td>
            <td>
              <select name="bestPicture-user-selection" v-on:change="updateBestPictureSelection(bestPicture[0])">
                <option value=""> --- </option>
                <option value="1">{{ bestPicture[0].nominationOneTop }}</option>
                <option value="2">{{ bestPicture[0].nominationTwoTop }}</option>
                <option value="3">{{ bestPicture[0].nominationThreeTop }}</option>
                <option value="4">{{ bestPicture[0].nominationFourTop }}</option>
                <option value="5">{{ bestPicture[0].nominationFiveTop }}</option>
                <option value="6">{{ bestPicture[0].nominationSixTop }}</option>
                <option value="7">{{ bestPicture[0].nominationSevenTop }}</option>
                <option value="8">{{ bestPicture[0].nominationEightTop }}</option>
                <option value="9">{{ bestPicture[0].nominationNineTop }}</option>
                <option value="10">{{ bestPicture[0].nominationTenTop }}</option>
              </select>
            </td>
            <td>
              <select name="bestPicture-winner-selection" v-on:change="updateBestPictureWinner(bestPicture[0])">
                <option value=""> --- </option>
                <option value="1">{{ bestPicture[0].nominationOneTop }}</option>
                <option value="2">{{ bestPicture[0].nominationTwoTop }}</option>
                <option value="3">{{ bestPicture[0].nominationThreeTop }}</option>
                <option value="4">{{ bestPicture[0].nominationFourTop }}</option>
                <option value="5">{{ bestPicture[0].nominationFiveTop }}</option>
                <option value="6">{{ bestPicture[0].nominationSixTop }}</option>
                <option value="7">{{ bestPicture[0].nominationSevenTop }}</option>
                <option value="8">{{ bestPicture[0].nominationEightTop }}</option>
                <option value="9">{{ bestPicture[0].nominationNineTop }}</option>
                <option value="10">{{ bestPicture[0].nominationTenTop }}</option>
              </select>
            </td>
            <td>
              {{ bestPicture[0].userResults }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationTwoTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationThreeTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationFourTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationFiveTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationSixTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationSevenTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationEightTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationNineTop }}
            </td>
          </tr>
          <tr>
            <td>
              {{ bestPicture[0].nominationTenTop }}
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <div>
      <div class="category" v-for="category in categories" :key="category.categoryId" :id="category.categoryId">
        <h3>{{ category.name }}</h3>
        <table class="tables">
          <tbody>
            <tr>
              <th class="table-header-one">Nomination Top</th>
              <th class="table-header-two">Nomination Bottom</th>
              <th class="table-header-three">Your Selection</th>
              <th class="table-header-four">Winner</th>
              <th class="table-header-five">Results</th>
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
      correctGuesses: 0,
      bestPicture: []
    }
  },
  computed:{
    
  },
  methods: {
    updateBestPictureSelection(bestPicture){
      let self = this;
      let bestPictureUserDropdown = document.querySelector('[name=bestPicture-user-selection]')
      let bestPictureUserDropdownValue = bestPictureUserDropdown.value;

      bestPicture.userSelection = bestPictureUserDropdownValue;
      
      if(bestPicture.winner == ""){
        bestPicture.userResults = "" 
      } else if (bestPicture.userSelection == ""){
        bestPicture.userResults = "Please make your selection"
      } else if(bestPicture.userSelection === bestPicture.winner) {
        bestPicture.userResults = "Correct!"
      } else {
        bestPicture.userResults = "Incorrect :("
      }

      self.tallyGuesses();
    },
    updateBestPictureWinner(bestPicture){
      let self = this;
      let bestPictureWinnerDropdown = document.querySelector('[name=bestPicture-winner-selection]')
      let bestPictureWinnerDropdownValue = bestPictureWinnerDropdown.value;

      bestPicture.winner = bestPictureWinnerDropdownValue;
      
      if(bestPicture.winner == ""){
        bestPicture.userResults = "" 
      } else if (bestPicture.userSelection == ""){
        bestPicture.userResults = "Please make your selection"
      } else if(bestPicture.userSelection === bestPicture.winner) {
        bestPicture.userResults = "Correct!"
      } else {
        bestPicture.userResults = "Incorrect :("
      }

      self.tallyGuesses();
    },
    updateUserSelection(categoryToUpdate){
      //at the end of this function, the code calls the tallyGuesses function. declaring this self variable allows to do that
      let self = this;
      let currentCategoryBox = document.getElementById(categoryToUpdate.categoryId);
      let currentUserDropdown = currentCategoryBox.querySelector('[name=user-selection]')
      let currentUserDropdownValue = currentUserDropdown.value;

      categoryToUpdate.userSelection = currentUserDropdownValue;
      
      if(categoryToUpdate.winner == ""){
        categoryToUpdate.userResults = "" 
      } else if (categoryToUpdate.userSelection == ""){
        categoryToUpdate.userResults = "Please make your selection"
      } else if(categoryToUpdate.userSelection === categoryToUpdate.winner) {
        categoryToUpdate.userResults = "Correct!"
      } else {
        categoryToUpdate.userResults = "Incorrect :("
      }

      self.tallyGuesses();
    },
    updateWinner(categoryToUpdate){
      //at the end of this function, the code calls the tallyGuesses function. declaring this self variable allows to do that
      let self = this;
      let currentCategoryBox = document.getElementById(categoryToUpdate.categoryId);
      let currentUserDropdown = currentCategoryBox.querySelector('[name=winner-selection]')
      let currentUserDropdownValue = currentUserDropdown.value;
      
      categoryToUpdate.winner = currentUserDropdownValue;

      if(categoryToUpdate.winner == ""){
        categoryToUpdate.userResults = ""
      } else if(categoryToUpdate.userSelection == ""){
        categoryToUpdate.userResults = "Please make your selection" 
      } else if(categoryToUpdate.userSelection === categoryToUpdate.winner) {
        categoryToUpdate.userResults = "Correct!";
      } else {
        categoryToUpdate.userResults = "Incorrect :("
      }

      self.tallyGuesses();
    },
    //this method loops through the categories array and if userResults == "Correct!" we increase the correct guesses by 1.
    //if we ever change "Correct!" we will need to change this as well
    //this method is currently called every time winner or userSelection is changed.
    tallyGuesses(){
      this.correctGuesses = 0;

      for(let i=0; i<this.categories.length; i++){
        if(this.categories[i].userResults == "Correct!"){
          this.correctGuesses++
        }
      }

      for(let i=0; i<this.bestPicture.length; i++){
        if(this.bestPicture[i].userResults == "Correct!"){
          this.correctGuesses++
        }
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

    CategoryService.getBestPictureCategory()
      .then(response => {
        console.log(response);
        this.bestPicture = response.data;
      })
      .catch(error => {
        console.log(error);
      });

    
  }
}
</script>

<style scoped>
.oscars {
  background-color: #be861e;
  height: 100%;
  overflow:auto;
}

.category {
  border: 1px solid #504538;
  border-radius: 5px;
  box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
  margin-bottom: 20px;
  padding: 10px;
  margin-left: 10px;
  margin-right: 10px;
  color: #201b15;
}

select {
  width: 200px;
}

td {
  text-align: left;
  padding-left: 10px;
}

th {
  text-decoration: underline;
}

.tables{
  width: 100%;
}

.table-header-one{
  width:22.5%
}
.table-header-two{
  width:22.5%
}
.table-header-three{
  width:15%
}
.table-header-four{
  width:15%
}
.table-header-five{
  width:15%
}

#bestPictureContainer {
  border: 5px solid blue;
  border-radius: 5px;
  margin: 10px;
}
</style>


