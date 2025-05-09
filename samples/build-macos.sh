#
#  Copyright 2023 Alexey Andreev.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
#

# Check if brew is installed
if ! command -v brew &> /dev/null
then
  echo "Homebrew is not installed."
  exit 1
fi

# Check if CMake is installed
if ! command -v cmake &> /dev/null
then
  brew install cmake
fi

# Check if make is installed
if ! command -v make &> /dev/null
then
  brew install make
fi

cmake -S . -B build/cmake -G "Unix Makefiles" || exit
pushd build/cmake || exit
make
popd || exit